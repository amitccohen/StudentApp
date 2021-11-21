package com.example.studentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.studentapp.Model.Model;
import com.example.studentapp.Model.Student;

import java.util.LinkedList;
import java.util.List;

public class StudentDetails extends AppCompatActivity {

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_details_activity);

        Intent intent = getIntent();

        int position = intent.getIntExtra("position",0);

        TextView nameTv = findViewById(R.id.student_details_name_tv);
        TextView idTv = findViewById(R.id.student_details_id_tv);
        TextView phoneTv = findViewById(R.id.student_details_phone_tv);
        TextView addressTv = findViewById(R.id.student_details_address_tv);
        CheckBox checkBox = findViewById(R.id.student_details_check_box);

        nameTv.setText(Model.instance.getStudentList().get(position).getStudentName());
        idTv.setText(Model.instance.getStudentList().get(position).getStudentId());
        phoneTv.setText(Model.instance.getStudentList().get(position).getStudentPhone());
        addressTv.setText(Model.instance.getStudentList().get(position).getStudentAddress());
        checkBox.setChecked(Model.instance.getStudentList().get(position).isStudentCb());


        Button editBtn = findViewById(R.id.edit_student_details_btn);
        editBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StudentDetails.this,EditStudentDetails.class);
                intent.putExtra("position",position);
                startActivity(intent);
            }
        });
    }
}