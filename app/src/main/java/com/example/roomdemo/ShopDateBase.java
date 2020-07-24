package com.example.roomdemo;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = ShopBean.class, version = 3,exportSchema = false)
public abstract class ShopDateBase extends RoomDatabase {

    public abstract ShopDao shopDao();
}
