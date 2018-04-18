package com.wridmob.listenQuran.activites;

import android.app.Activity;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.HashMap;

public class SongsManager {

    final String MEDIA_PATH = new String("/sdcard/");
    private ArrayList<HashMap<String, String>> songsList = new ArrayList<HashMap<String, String>>();
    Activity activity;
    public SongsManager(Activity activity){
      this.activity=activity;
    }


    public ArrayList<HashMap<String, String>> getPlayList(String  RecitesName){
        File home = new File(MEDIA_PATH);

        ArrayList<Author> list=new ArrayList<Author>();
        Paramas lc=new Paramas(activity);
        list=lc.GuranAya(RecitesName);
        for(Author temp:list){

            HashMap<String, String> song = new HashMap<String, String>();
            song.put("songTitle", temp.RealName  );
            song.put("songPath",   temp.ImgUrl  );

            songsList.add(song);
        }
        return songsList;
    }


}
