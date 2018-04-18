package com.wridmob.listenQuran.activites;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.miguelcatalan.materialsearchview.MaterialSearchView;
import com.wridmob.listenQuran.R;
import com.wridmob.listenQuran.helpers.DividerItemDecoration;
import com.wridmob.listenQuran.helpers.Helper;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;


public class AyaActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    public static ArrayList<Author> listrecitesAya;
    static String RecitesName = "";
    String RecitesAYA = "";
    int flag = 0;
    private MaterialSearchView searchView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aya_list);

        /*---------------------------define toolbar------------------------------*/
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        try {
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        centerToolbarTitle(toolbar);

        /*-------------------------get Bundle---------------------------------------*/
        Bundle b = getIntent().getExtras();
        RecitesName = b.getString("AuthorActivity");

        /*-------------------define components----------------------------------*/
        listrecitesAya= new ArrayList<>();
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);



        /*-----------------------------initialize searchView-----------------------*/
        searchView = (MaterialSearchView) findViewById(R.id.search_view);
        searchView.setVoiceSearch(false);
        searchView.setCursorDrawable(R.drawable.cursor);
        searchView.setEllipsize(true);


        /*------------------------------get list of ayettes by Author-----------------------------*/
        Paramas lc = new Paramas(this);
        listrecitesAya = lc.GuranAya(RecitesName);

        /*--------------------------------put data in  recyclerView--------------------------------------*/
        recyclerView.setAdapter(new VivzAdapter(listrecitesAya));
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL_LIST);
        recyclerView.addItemDecoration(itemDecoration);
        recyclerView.setHasFixedSize(true);


        /*------------------------------------task of searchView-----------------------------------------------*/
        searchView.setOnQueryTextListener(new MaterialSearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                ArrayList<Author> listrecitestemp = new ArrayList<>();
                for (Author listrecitesitem : listrecitesAya) {
                    if (listrecitesitem.RealName.contains(query)) {
                        listrecitestemp.add(listrecitesitem);
                    }
                }
                recyclerView.setAdapter(new VivzAdapter(listrecitestemp));

                searchView.showSearch(false);
                searchView.setQuery(query, false);

                flag = 1;
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });

        searchView.setOnSearchViewListener(new MaterialSearchView.SearchViewListener() {
            @Override
            public void onSearchViewShown() {
            }

            @Override
            public void onSearchViewClosed() {
              if(flag == 1){
                  recyclerView.setAdapter(new VivzAdapter(listrecitesAya));
              }else {
                  flag =0;
              }
            }
        });
    }


    static void centerToolbarTitle(Toolbar toolbar) {
        final CharSequence title = toolbar.getTitle();
        final ArrayList<View> outViews = new ArrayList<>(1);
        toolbar.findViewsWithText(outViews, title, View.FIND_VIEWS_WITH_TEXT);
        if (!outViews.isEmpty()) {
            final TextView titleView = (TextView) outViews.get(0);
            titleView.setGravity(Gravity.RIGHT);
            final Toolbar.LayoutParams layoutParams = (Toolbar.LayoutParams) titleView.getLayoutParams();
            layoutParams.width = ViewGroup.LayoutParams.MATCH_PARENT;
            toolbar.requestLayout();
        }
    }

    private void DisplayAya() {
        Intent intent = new Intent(this, AyaDisplayActivity.class);
        intent.putExtra("AuthorActivity", RecitesName);
        intent.putExtra("RecitesAYA", RecitesAYA);
        startActivity(intent);
    }

    public void LoadAya() {
        ListView list = (ListView) findViewById(R.id.listView);
        //get list of recites
        Paramas lc = new Paramas(this);
        listrecitesAya = lc.GuranAya(RecitesName);
        recyclerView.setAdapter(new VivzAdapter(listrecitesAya));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_aya_list, menu);
        MenuItem item = menu.findItem(R.id.action_search);
        searchView.setMenuItem(item);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case android.R.id.home:
                onBackPressed();
                break;
          /*  case R.id.action_folder:
                openFolder();
              break;
              */

        }
        return super.onOptionsItemSelected(item);
    }


    public void openFolder()
    {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        Uri imgUri = Uri.parse("file://sdcard/download");
        intent.setDataAndType(imgUri, "*/*");
        startActivity(intent);
    }



    /// file downlaod
    public void startDownload(String ImgUrl, String ServerName) {
        RecitesAYA = ServerName;
        String url = ImgUrl;// "http://farm1.static.flickr.com/114/298125983_0e4bf66782_b.jpg";
        new DownloadFileAsync().execute(url);
    }




    @Override
    public void onBackPressed() {
        if (searchView.isSearchOpen()) {
            searchView.closeSearch();
        } else {
            finish();
        }
    }

    public boolean ISDonwloading = false;

    class DownloadFileAsync extends AsyncTask<String, String, String> {
       final ProgressDialog progressDialog= Helper.showProgressBar(AyaActivity.this);
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
         //   LayoutLoading.setVisibility(View.VISIBLE);
          //  progressBar.setProgress(0);
          //  progressBar.setMax(100);

            ISDonwloading = true;


            progressDialog.show();


            // showDialog(DIALOG_DOWNLOAD_PROGRESS);
        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;
            try {
                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();
                int lenghtOfFile = conexion.getContentLength();
                //Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                String SDPath = Environment.getExternalStorageDirectory().getPath() + "/";
                OutputStream output = new FileOutputStream(SDPath + RecitesName + RecitesAYA + ".mp3");
                byte data[] = new byte[1024];
                long total = 0;
                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                    output.write(data, 0, count);
                }

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {
            }
            return null;

        }

        protected void onProgressUpdate(String... progress) {
            // Log.d("ANDRO_ASYNC",progress[0]);
            progressDialog.setProgress(Integer.parseInt(progress[0]));
            //progressBar.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String unused) {
            LoadAya();
            //dismissDialog(DIALOG_DOWNLOAD_PROGRESS);
            progressDialog.dismiss();
          //  LayoutLoading.setVisibility(View.GONE);
            ISDonwloading = false;

        }
    }

    //=====================================
    class VivzAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


        ArrayList<Author> data;

        VivzAdapter(ArrayList<Author> listrecites) {

            data = new ArrayList<Author>();
            data = listrecites;

        }

        @Override
        public int getItemCount() {
            return data.size();
        }

        public int getCount() {
            return this.data.size();
        }

        public String getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            RecyclerView.ViewHolder vh;
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_rowayalist, parent, false);
            vh = new MyViewHolder(v);
            return vh;
        }

        public class MyViewHolder extends RecyclerView.ViewHolder {
            TextView title;
            //  TextView cost;
            TextView textNumber;
            ImageView budownload;

            public MyViewHolder(View v) {
                super(v);
                title = (TextView) v.findViewById(R.id.textView1);
                // cost = (TextView) v.findViewById(R.id.textView2);
                textNumber = (TextView) v.findViewById(R.id.text_number);
                budownload = (ImageView) v.findViewById(R.id.button);
            }
        }


        @Override
        public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {
            final MyViewHolder myViewHolder = (MyViewHolder) holder;
            final Author authorClasse = this.data.get(position);
            final String ServerName = authorClasse.ServerName;

            myViewHolder.textNumber.setText("" + (position + 1));


            // if already dowload
            if (authorClasse.StateName.equals(Paramas.avalible()))
                myViewHolder.budownload.setVisibility(View.INVISIBLE);
            // downlaod file
            myViewHolder.budownload.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (ISDonwloading != true)
                        startDownload(authorClasse.ImgUrl, ServerName);
                }
            });
            //=====================================================
            myViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    //get aya
                    if (ISDonwloading != true)
                        for (int i = 0; i < listrecitesAya.size(); i++) {
                            if (listrecitesAya.get(i).RealName.equals(authorClasse.RealName)) {
                                RecitesAYA = String.valueOf(i);// ServerName;
                                DisplayAya();
                                break;
                            }

                        }

                }
            });
            myViewHolder.title.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    //get aya
                    if (ISDonwloading != true)
                        for (int i = 0; i < listrecitesAya.size(); i++) {
                            if (listrecitesAya.get(i).RealName.equals(authorClasse.RealName)) {
                                RecitesAYA = String.valueOf(i);// ServerName;
                                DisplayAya();
                                break;
                            }

                        }
                }
            });

            myViewHolder.title.setText(authorClasse.RealName);
            //  myViewHolder.cost.setText(authorClasse.StateName);
        }
    }
}
