package com.example.roomdemo;

import android.app.Application;
import android.arch.persistence.room.Room;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        DataBaseHelp.getInstance().init(this);

    }
}
