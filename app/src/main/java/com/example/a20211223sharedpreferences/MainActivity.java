package com.example.a20211223sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // visit interface
        //get preferences-> activity 独有的
        /*Method1 to store data
        SharedPreferences shp= getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor= shp.edit();
        editor.putInt("NUMBER",100);
        editor.apply();
        String TAG="myLog";
        int x = shp.getInt("NUMBER",0);
        Log.d(TAG,"onCreate"+x);
         */

        // getSharedPreferences 可以共享数据源
        // method 2 to store data
        SharedPreferences shp = getSharedPreferences("MY_DATA", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor= shp.edit();
        editor.putInt("NUMBER",600);
        editor.apply();
        String TAG="myLog";
        int x = shp.getInt("NUMBER",0);
        Log.d(TAG,"onCreate"+x);



    }
}