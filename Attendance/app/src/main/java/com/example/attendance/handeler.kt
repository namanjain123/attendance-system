package com.example.attendance

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

val DATABASE_NAME="attendance"
val TABEL_NAME="teacher"
val COL_ID="id"
val COL_PASSWORD="password"
class handeler(context:Context):SQLiteOpenHelper(context, DATABASE_NAME,null,1){
    override fun onCreate(p0: SQLiteDatabase?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        val createTable="CREATE TABLE" + TABEL_NAME +"(" + COL_ID +"VARCHAR(256) PRIMARY KEY" + COL_PASSWORD +"VARCHAR(256)";
        p0

            ?.execSQL(createTable)
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}