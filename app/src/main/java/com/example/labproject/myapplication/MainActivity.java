package com.example.labproject.myapplication;

import android.content.Intent;
import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addClick(View view){
        EditText e1 = (EditText) findViewById(R.id.editText);
        EditText e2 = (EditText) findViewById(R.id.editText2);
        EditText e3 = (EditText) findViewById(R.id.editText3);

        Student s = new Student();
        s.setmID(Integer.parseInt(e1.getText().toString()));
        s.setmLastName(e2.getText().toString());
        s.setmGPA(Integer.parseInt(e3.getText().toString()));

        StudentDBHandler studentDBHandler = new StudentDBHandler(this);
        studentDBHandler.addStudent(s);
    }

    public void findClick(View view){
        EditText e1 = (EditText) findViewById(R.id.editText);
        EditText e2 = (EditText) findViewById(R.id.editText2);
        EditText e3 = (EditText) findViewById(R.id.editText3);
        String name =  ((EditText) findViewById(R.id.editText2)).getText().toString();

        StudentDBHandler studentDBHandler = new StudentDBHandler(this);

        Student student = studentDBHandler.findStudent(name);

        if(student != null){
            e3.setText(Float.valueOf(student.getmGPA()).toString());
            e1.setText(Integer.valueOf(student.getmID()).toString());
        }else{
            e2.setText("STUDENT NOT FOUND");
        }

    }
}
