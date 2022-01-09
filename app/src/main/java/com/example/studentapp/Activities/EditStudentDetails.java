//package com.example.studentapp.Activities;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.CheckBox;
//import android.widget.EditText;
//import android.widget.TextView;
//
//import com.example.studentapp.Model.Model;
//import com.example.studentapp.R;
//
//public class EditStudentDetails extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.edit_student_details_activity);
//
//        Intent intent = getIntent();
//
//        int position = intent.getIntExtra("position",0);
//
//        EditText nameEt = findViewById(R.id.edit_student_details_name_et);
//        EditText idEt = findViewById(R.id.edit_student_details_id_et);
//        EditText phoneEt = findViewById(R.id.edit_student_details_phone_et);
//        EditText addressEt = findViewById(R.id.edit_student_details_address_et);
//        CheckBox checkBox = findViewById(R.id.edit_student_details_check_box);
//
//        nameEt.setText(Model.instance.getStudentList().get(position).getStudentName());
//        idEt.setText(Model.instance.getStudentList().get(position).getStudentId());
//        phoneEt.setText(Model.instance.getStudentList().get(position).getStudentPhone());
//        addressEt.setText(Model.instance.getStudentList().get(position).getStudentAddress());
//        checkBox.setChecked(Model.instance.getStudentList().get(position).isStudentCb());
//
//
//        Button cancelBtn = findViewById(R.id.edit_student_cancel_btn);
//        cancelBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                finish();
//            }
//        });
//        Button deleteBtn = findViewById(R.id.edit_student_delete_btn);
//        deleteBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Model.instance.deleteStudent(position);
//                finish();
//            }
//        });
//        Button saveBtn = findViewById(R.id.edit_student_save_btn);
//        saveBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Model.instance.getStudentList().get(position).setStudentName(nameEt.getText().toString());
//                Model.instance.getStudentList().get(position).setStudentId(idEt.getText().toString());
//                Model.instance.getStudentList().get(position).setStudentPhone(phoneEt.getText().toString());
//                Model.instance.getStudentList().get(position).setStudentAddress(addressEt.getText().toString());
//                Model.instance.getStudentList().get(position).setStudentCb(checkBox.isChecked());
//                finish();
//            }
//        });
//    }
//}