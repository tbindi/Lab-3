package com.example.labproject.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by tanmay on 26/01/17.
 */
public class StudentDBHandler extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "studentDB.db";

    // declare TABLE constants in single place to make edits
    private static final String TABLE = "Students";
    private static final String COLUMN_STUDENT_ID = "student_id";
    private static final String COLUMN_STUDENT_LASTNAME = "lastname";
    private static final String COLUMN_STUDENT_GPA = "gpa";

    public StudentDBHandler(Context context){ //, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Write your create string here.
        String createSQL = "";
        db.execSQL(createSQL);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE);
        onCreate(db);
    }

    public void addStudent(Student s){

    }

    public Student findStudent(int id){
        Student s = null;
        
        return s;
    }

}
