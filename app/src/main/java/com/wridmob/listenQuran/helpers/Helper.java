package com.wridmob.listenQuran.helpers;


import android.app.Activity;
import android.app.ProgressDialog;

import com.wridmob.listenQuran.R;

public class Helper {


    public static ProgressDialog showProgressBar(Activity activity){
        ProgressDialog mProgressDialog = new ProgressDialog(activity,R.style.AppCompatAlertDialogStyle);
        mProgressDialog.setMessage(activity.getResources().getString(R.string.downlaod_file));
        mProgressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        mProgressDialog.setCancelable(false);
        return mProgressDialog;
    }

    public static ProgressDialog showProgressBarCircle(Activity activity){
        ProgressDialog mProgressDialog = new ProgressDialog(activity,R.style.AppCompatAlertDialogStyle);
        mProgressDialog.setMessage(activity.getResources().getString(R.string.downlaod_file));
        mProgressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        mProgressDialog.setCancelable(false);
        return mProgressDialog;
    }



    public static String milliSecondsToTimer(long milliseconds){
        String finalTimerString = "";
        String secondsString = "";

        int hours = (int)( milliseconds / (1000*60*60));
        int minutes = (int)(milliseconds % (1000*60*60)) / (1000*60);
        int seconds = (int) ((milliseconds % (1000*60*60)) % (1000*60) / 1000);
        if(hours > 0){
            finalTimerString = hours + ":";
        }

        if(seconds < 10){
            secondsString = "0" + seconds;
        }else{
            secondsString = "" + seconds;}

        finalTimerString = finalTimerString + minutes + ":" + secondsString;

        return finalTimerString;
    }


    public static int getProgressPercentage(long currentDuration, long totalDuration){
        Double percentage = (double) 0;

        long currentSeconds = (int) (currentDuration / 1000);
        long totalSeconds = (int) (totalDuration / 1000);

        percentage =(((double)currentSeconds)/totalSeconds)*100;

        return percentage.intValue();
    }

    public static int progressToTimer(int progress, int totalDuration) {
        int currentDuration = 0;
        totalDuration = (int) (totalDuration / 1000);
        currentDuration = (int) ((((double)progress) / 100) * totalDuration);

        return currentDuration * 1000;
    }

}
