package com.example.roomdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<ShopBean> shopDao = DataBaseHelp.getInstance().queryAll();
        Log.e("TAG", "第一次查询:" + shopDao.toString());
        ShopBean shopBean = new ShopBean();
        shopBean.address = "北京";
        DateBean dateBean = new DateBean();
        dateBean.setDate("date");
        List<DateBean> dateBeans = new ArrayList<>();
        dateBeans.add(dateBean);
        shopBean.setDateBeanList(dateBeans);
        DataBaseHelp.getInstance().insertAll(shopBean);
        List<ShopBean> shopDao1 = DataBaseHelp.getInstance().queryAll();
        Log.e("TAG", "第二次查询:" + shopDao1.toString());
        DataBaseHelp.getInstance().delete(shopBean);
        List<ShopBean> shopDao2 = DataBaseHelp.getInstance().queryAll();
        Log.e("TAG", "第二次查询:" + shopDao2.toString());
    }
}