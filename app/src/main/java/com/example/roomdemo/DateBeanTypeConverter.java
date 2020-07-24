package com.example.roomdemo;

import android.arch.persistence.room.TypeConverter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

public class DateBeanTypeConverter {

    Gson gson = new Gson();

    @TypeConverter
    public List<DateBean> stringToSomeObjectList(String data) {
        if (data == null) {
            return Collections.emptyList();
        }

        Type listType = new TypeToken<List<DateBean>>() {
        }.getType();

        return gson.fromJson(data, listType);
    }

    @TypeConverter
    public String someObjectListToString(List<DateBean> someObjects) {
        return gson.toJson(someObjects);
    }

}
