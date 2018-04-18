package com.wridmob.listenQuran.activites;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
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
import android.widget.TextView;

import com.amulyakhare.textdrawable.TextDrawable;
import com.amulyakhare.textdrawable.util.ColorGenerator;
import com.miguelcatalan.materialsearchview.MaterialSearchView;
import com.wridmob.listenQuran.R;
import com.wridmob.listenQuran.helpers.DividerItemDecoration;

import java.util.ArrayList;


public class AuthorActivity extends AppCompatActivity {
    public ArrayList<Author> listrecites;
    RecyclerView recyclerView;
    String RecitesName = "";
    private MaterialSearchView searchView;
    Toolbar toolbar;
    int flag = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recites_name);

        /*--------------------------------------define Toolbar-------------------------------------------------*/
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        centerToolbarTitle(toolbar);

        /*----------------------------declare components----------------------------------*/
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        searchView = (MaterialSearchView) findViewById(R.id.search_view);
        listrecites = new ArrayList<>();

        /*----------------------------------features of searchView-------------------------------------*/
        searchView.setVoiceSearch(false);
        searchView.setCursorDrawable(R.drawable.cursor);
        searchView.setEllipsize(true);

        /*----------------------------------RecyclerView----------------------------------------*/
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL_LIST);
        recyclerView.addItemDecoration(itemDecoration);
        recyclerView.setHasFixedSize(true);


        /*----------------------------------get list of Author----------------------------------*/
        Paramas lc = new Paramas(this);
        listrecites = lc.AutherList();
        recyclerView.setAdapter(new VivzAdapter(listrecites));


        /*-----------------------------searchView-------------------------------------*/
        searchView.setOnQueryTextListener(new MaterialSearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                ArrayList<Author> listrecitestemp = new ArrayList<>();
                for (Author listrecitesitem : listrecites) {
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
                    recyclerView.setAdapter(new VivzAdapter(listrecites));
                }else {
                    flag =0;
                }
            }
        });
    }


    @Override
    public void onBackPressed() {
        if (searchView.isSearchOpen()) {
            searchView.closeSearch();
        } else {
            finish();
        }
    }

    void ListAya() {
        try {
            if (RecitesName.length() > 1) {
                Intent intent = new Intent(this, AyaActivity.class);
                intent.putExtra("AuthorActivity", RecitesName);
                startActivity(intent);
            }
        } catch (Exception ex) {
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_recites_name, menu);
        MenuItem item = menu.findItem(R.id.action_search);
        searchView.setMenuItem(item);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.menu) {
            Intent intent = new Intent(this, SettingsActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
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


    class VivzAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        ArrayList<Author> data;

        VivzAdapter(ArrayList<Author> listrecites) {
            data = new ArrayList<>();
            data = listrecites;
        }

        public int getCount() {
            return data.size();
        }


        public String getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public int getItemCount() {
            return data.size();
        }

        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            RecyclerView.ViewHolder vh;
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recites_ticket, parent, false);
            vh = new MyViewHolder(v);
            return vh;
        }

        @Override
        public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {
            final MyViewHolder myViewHolder = (MyViewHolder) holder;
            final Author author = data.get(position);
            myViewHolder.txtRecitesName.setText(author.RealName);

            String letter = String.valueOf(author.RealName.trim().charAt(0)).toUpperCase();
            ColorGenerator generator = ColorGenerator.MATERIAL;
            TextDrawable drawable = TextDrawable.builder().buildRound(letter, generator.getRandomColor());
            myViewHolder.imageView.setImageDrawable(drawable);

            myViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    for (Author listrecitesitem : data) {
                        if (listrecitesitem.RealName.equals(myViewHolder.txtRecitesName.getText())) {
                            RecitesName = listrecitesitem.ServerName;
                            ListAya();
                            break;
                        }
                    }
                }
            });
        }

        public class MyViewHolder extends RecyclerView.ViewHolder {
            TextView txtRecitesName;
            ImageView imageView;

            public MyViewHolder(View v) {
                super(v);
                txtRecitesName = (TextView) v.findViewById(R.id.txtRecitesName);
                imageView = (ImageView) v.findViewById(R.id.img);
            }
        }
    }

    //get access to mailbox
    final private int REQUEST_CODE_ASK_PERMISSIONS = 123;

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        switch (requestCode) {
            case REQUEST_CODE_ASK_PERMISSIONS:
                if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                    ListAya();
                } else {
                    ListAya();
                }
                break;
            default:
                super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        }
    }



}
