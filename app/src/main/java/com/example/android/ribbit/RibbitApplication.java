package com.example.android.ribbit;

import android.app.Application;

import com.parse.ParseObject;

public class RibbitApplication extends Application {
    public void onCreate(){
        super.onCreate();
        ParseObject testObject = new ParseObject("TestObject");
        testObject.put( "foo", "bar" );
        testObject.saveInBackground();
    }
}
