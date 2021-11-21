package com.example.studentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.studentapp.Model.Model;
import com.example.studentapp.Model.Student;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    MyAdapter adapter;

    @Override
    protected void onResume() {
        super.onResume();
        adapter.notifyDataSetChanged();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView studentList = findViewById(R.id.student_list_v);
        adapter = new MyAdapter();
        studentList.setAdapter(adapter);

        FloatingActionButton addStudentBtn = findViewById(R.id.add_student_floating_btn);
        addStudentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AddStudentActivity.class);
                startActivity(intent);
            }
        });


        studentList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(MainActivity.this,StudentDetails.class);
                intent.putExtra("position",position);
                startActivity(intent);
            }
        });
    }

    class MyAdapter extends BaseAdapter{
        @Override
        public int getCount() {
            return Model.instance.getStudentList().size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null){
                LayoutInflater inflater = getLayoutInflater();
                convertView = inflater.inflate(R.layout.list_row,null);
            }
            String studentName = Model.instance.getStudentList().get(position).getStudentName();
            String studentId = Model.instance.getStudentList().get(position).getStudentId();
            boolean studentCb = Model.instance.getStudentList().get(position).isStudentCb();
            TextView studentNameTv = convertView.findViewById(R.id.student_name_tv);
            TextView studentIdTv = convertView.findViewById(R.id.student_id_tv);
            CheckBox studentCheckBox = convertView.findViewById(R.id.student_cb);

            studentNameTv.setText(studentName);
            studentIdTv.setText(studentId);
            studentCheckBox.setChecked(studentCb);

            return convertView;
        }
    }

}