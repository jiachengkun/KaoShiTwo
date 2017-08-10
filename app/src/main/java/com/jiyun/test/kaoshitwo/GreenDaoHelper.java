package com.jiyun.test.kaoshitwo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.jiyun.test.kaoshitwo.greendao.DaoMaster;

/**
 * Created by 贾成昆 on 2017/5/22.
 */

public class GreenDaoHelper {
    private static GreenDaoHelper helper;
    private final DaoMaster.DevOpenHelper helper11;

    private GreenDaoHelper(Context context){
        helper11 = new DaoMaster.DevOpenHelper(context,"students");
    }

    public static synchronized GreenDaoHelper getInstance(Context context){
        if (helper==null)
            helper=new GreenDaoHelper(context);
            return helper;
    }
    public SQLiteDatabase getWriter(){
        return helper11.getWritableDatabase();

    }

    public SQLiteDatabase getReader(){
        return helper11.getReadableDatabase();
    }
}
