package com.example.labproject.myapplication;

<<<<<<< HEAD
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
=======
import android.content.Context;
>>>>>>> 4b77b949b094da192244c83192acd178caee6ec3
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
<<<<<<< HEAD
        String createSQL = "CREATE TABLE " + TABLE + " (" +
                COLUMN_STUDENT_ID + " INTEGER PRIMARY KEY, "+
                COLUMN_STUDENT_LASTNAME + " TEXT, " +
                COLUMN_STUDENT_GPA + " FLOAT)";
=======
        String createSQL = "";
>>>>>>> 4b77b949b094da192244c83192acd178caee6ec3
        db.execSQL(createSQL);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE);
        onCreate(db);
    }

    public void addStudent(Student s){
<<<<<<< HEAD
        ContentValues cv = new ContentValues();
        cv.put(COLUMN_STUDENT_ID, s.getmID());
        cv.put(COLUMN_STUDENT_LASTNAME, s.getmLastName());
        cv.put(COLUMN_STUDENT_GPA, s.getmGPA());

        SQLiteDatabase db = this.getWritableDatabase();

        db.insert(TABLE, null, cv);

        db.close();
    }

    public Student findStudent(String name){
        String sqlQuery = "SELECT * FROM "+ TABLE + " WHERE " +
                COLUMN_STUDENT_LASTNAME + " = \"" + name + "\"" ;

        SQLiteDatabase db = this.getWritableDatabase();

        Cursor cursor = db.rawQuery(sqlQuery, null);

        Student s = new Student();

        if(cursor.moveToFirst()){
            s.setmID(cursor.getInt(0));
            s.setmLastName(cursor.getString(1));
            s.setmGPA(cursor.getFloat(2));
            cursor.close();
        }else{
            s = null;
        }

        db.close();
=======

    }

    public Student findStudent(int id){
        Student s = null;
        
>>>>>>> 4b77b949b094da192244c83192acd178caee6ec3
        return s;
    }

}
