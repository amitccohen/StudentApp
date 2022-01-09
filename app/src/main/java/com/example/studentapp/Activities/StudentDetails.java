package com.example.studentapp.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.studentapp.Model.Model;
import com.example.studentapp.Model.Student;
import com.example.studentapp.R;

import java.util.LinkedList;
import java.util.List;

public class StudentDetails extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_details_activity);


    }
}