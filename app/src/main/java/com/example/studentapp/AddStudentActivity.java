package com.example.studentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.example.studentapp.Model.Model;
import com.example.studentapp.Model.Student;

import java.util.LinkedList;
import java.util.List;

public class AddStudentActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_student_acticity);


        EditText studentNameEt = findViewById(R.id.student_name_et);
        EditText studentIdEt = findViewById(R.id.student_id_et);
        EditText studentPhoneEt = findViewById(R.id.student_phone_et);
        EditText studentAddressEt = findViewById(R.id.student_address_et);
        CheckBox studentCb = findViewById(R.id.student_checked_cb);


        Button saveBtn = findViewById(R.id.save_btn);
        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String studentName = studentNameEt.getText().toString();
                String studentId = studentIdEt.getText().toString();
                String studentPhone = studentPhoneEt.getText().toString();
                String studentAddress = studentAddressEt.getText().toString();
                Student student = new Student(studentName,studentId,studentAddress,studentPhone,studentCb.isChecked());
                Model.instance.addNewStudent(student);

                finish();
            }
        });

        Button cancelBtn = findViewById(R.id.cancel_btn);
        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}