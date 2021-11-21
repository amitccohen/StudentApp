package com.example.studentapp.Model;

import android.util.Log;

import java.util.LinkedList;
import java.util.List;

public class Model {
    static final public Model instance = new Model();
    private List<Student> data = new LinkedList<Student>();

    private Model(){
        for (int i = 0; i < data.size(); ++i){
            String studentName = data.get(i).getStudentName();
            String studentId = data.get(i).getStudentId();
            String studentAddress = data.get(i).getStudentAddress();
            String studentPhone = data.get(i).getStudentPhone();
            boolean studentCb = data.get(i).isStudentCb();

            Student student = new Student(studentName,studentId,studentAddress,studentPhone,studentCb);
            data.add(student);
        }
    }

    public List<Student> getStudentList(){
        return data;
    }

    public void addNewStudent(Student student){
        data.add(student);
    }

    public void deleteStudent(int position){
        data.remove(position);
    }
}
