package com.example.roomdemo;

import android.arch.persistence.room.Room;
import android.content.Context;

import java.util.List;

public class DataBaseHelp {


    private ShopDateBase mDatabase;

    private DataBaseHelp() {
    }

    public static DataBaseHelp getInstance() {
        return DataBaseHelpHolder.sInstance;
    }

    private static class DataBaseHelpHolder {
        private static final DataBaseHelp sInstance = new DataBaseHelp();

    }

    public void init(Context context) {
        mDatabase = Room.databaseBuilder(context.getApplicationContext(),
                ShopDateBase.class, "database")
                .fallbackToDestructiveMigration()
                .allowMainThreadQueries()
                .build();
    }

    public List<ShopBean> queryAll() {
        return mDatabase.shopDao().queryAll();
    }

    public void insertAll(ShopBean... shopBean) {
        mDatabase.shopDao().insertAll(shopBean);
    }

    public void delete(ShopBean... shopBean) {
        mDatabase.shopDao().delete(shopBean);
    }
}
