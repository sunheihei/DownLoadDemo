package com.sunexample.downloaddemo.sqlite

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class TaskDatabaseHelper(val context:Context,name:String,version:Int) : SQLiteOpenHelper(context,name,null,version){


    private val createTask = "create table Task (" +
            " id integer primary key autoincrement," +
            " taskname text," +
            " fileurl text )"

    override fun onCreate(db: SQLiteDatabase?) {
        db!!.execSQL(createTask)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

    }


}