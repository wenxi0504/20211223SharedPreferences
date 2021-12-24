package com.example.a20211223sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;

public class MyData {
    public int number;
    private Context context;
    public MyData(Context context){
        this.context=context;

    }
    public void save(){
        //SharedPreferences shp= context.getSharedPreferences("MY_DATA",Context.MODE_PRIVATE);//Hardcoded
        String name=context.getResources().getString(R.string.MY_DATA);
        SharedPreferences shp= context.getSharedPreferences(name,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor= shp.edit();
        String key=context.getResources().getString((R.string.MY_KEY));
        editor.putInt(key,number);
        editor.apply();


    }
    public int load(){
        String name=context.getResources().getString(R.string.MY_DATA);
        SharedPreferences shp= context.getSharedPreferences(name,Context.MODE_PRIVATE);
        String key=context.getResources().getString((R.string.MY_KEY));
        int x=shp.getInt(key,context.getResources().getInteger((R.integer.defValue)));
        number=x;
        return x;
    }
}