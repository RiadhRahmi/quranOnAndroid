package com.wridmob.listenQuran.activites;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.wridmob.listenQuran.R;
import com.wridmob.listenQuran.helpers.DividerItemDecoration;

import java.util.ArrayList;
import java.util.List;

public class SettingsActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Toolbar toolbar;
    List<String> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_settings);

        /*---------------------------define toolbar------------------------------*/
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        try {
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        centerToolbarTitle(toolbar);
        data = new ArrayList<>();
        data.clear();
        data.add(getResources().getString(R.string.share_app));
        data.add(getResources().getString(R.string.rate));
        data.add(getResources().getString(R.string.other));
        data.add(getResources().getString(R.string.about));

          /*--------------------------------put data in  recyclerView--------------------------------------*/
        recyclerView.setAdapter(new myAdapter(data));
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL_LIST);
        recyclerView.addItemDecoration(itemDecoration);
        recyclerView.setHasFixedSize(true);


    }

    static void centerToolbarTitle(Toolbar toolbar) {
        final CharSequence title = toolbar.getTitle();
        final ArrayList<View> outViews = new ArrayList<>(1);
        toolbar.findViewsWithText(outViews, title, View.FIND_VIEWS_WITH_TEXT);
        if (!outViews.isEmpty()) {
            final TextView titleView = (TextView) outViews.get(0);
            titleView.setGravity(Gravity.LEFT);
            final Toolbar.LayoutParams layoutParams = (Toolbar.LayoutParams) titleView.getLayoutParams();
            layoutParams.width = ViewGroup.LayoutParams.MATCH_PARENT;
            toolbar.requestLayout();
        }
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case android.R.id.home:
                onBackPressed();
                break;
        }
        return super.onOptionsItemSelected(item);
    }




    /*------------------------------my Adapter---------------------------------------*/

    class myAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


        List<String> data;

        myAdapter(List<String> data) {

            this.data = data;

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
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_settings, parent, false);
            vh = new MyViewHolder(v);
            return vh;
        }

        @Override
        public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {
            final MyViewHolder myViewHolder = (MyViewHolder) holder;
            final String nom = data.get(position);
            myViewHolder.name.setText(nom);

            if (position == 0) {
                myViewHolder.imageView.setImageResource(R.drawable.ic_share_black_24dp);
            }

            if (position == 1) {
                myViewHolder.imageView.setImageResource(R.drawable.ic_star_black_24dp);
            }
            if (position == 2) {
                myViewHolder.imageView.setImageResource(R.drawable.ic_android_black_24dp);
            }
            if (position == 3) {
                myViewHolder.imageView.setImageResource(R.drawable.ic_info_black_24dp);
            }

            myViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (position == 0) {
                        share(v);
                    }

                    if (position == 1) {
                        rating(v);
                    }

                    if (position == 2) {
                        myApplications(v);
                    }

                    if (position == 3) {
                       startActivity(new Intent(SettingsActivity.this,AboutActivity.class));
                    }
                }
            });

        }

        public class MyViewHolder extends RecyclerView.ViewHolder {
            TextView name;
            ImageView imageView;

            public MyViewHolder(View v) {
                super(v);
                name = (TextView) v.findViewById(R.id.txtRecitesName);
                imageView = (ImageView) v.findViewById(R.id.img);
            }
        }

        public void share(View view) {
            final Intent shareIntent = new Intent(Intent.ACTION_SEND);
            shareIntent.setType("image/jpg");
            shareIntent.putExtra(Intent.EXTRA_SUBJECT, getResources().getString(R.string.app_name));
            shareIntent.putExtra(Intent.EXTRA_TEXT,"http://play.google.com/store/apps/details?id=" + getPackageName());
            startActivity(Intent.createChooser(shareIntent, getResources().getString(R.string.share)));
        }

        public void rating(View view) {
            try {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + getPackageName())));
            } catch (ActivityNotFoundException e) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/details?id=" + getPackageName())));
            }
        }

        public void myApplications(View view) {
            try {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://developer?id=WridMob")));
            } catch (ActivityNotFoundException e) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/developer?id=WridMob")));
            }
        }

    }

}