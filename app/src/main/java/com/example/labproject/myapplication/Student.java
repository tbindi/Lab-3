package com.example.labproject.myapplication;

/**
 * Created by tanmay on 25/01/17.
 */
public class Student {
    private int mID;
    private String mLastName;
    private float mGPA;

    public Student(){}



    public float getmGPA() {
        return mGPA;
    }

    public void setmGPA(float mGPA) {
        this.mGPA = mGPA;
    }

    public int getmID() {
        return mID;
    }

    public void setmID(int mID) {
        this.mID = mID;
    }

    public String getmLastName() {
        return mLastName;
    }

    public void setmLastName(String mLastName) {
        this.mLastName = mLastName;
    }
}
