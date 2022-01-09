package com.example.studentapp.Model;

import android.util.Log;

import com.example.studentapp.MyApplication;

import java.util.LinkedList;
import java.util.List;

public class Model {
    static final public Model instance = new Model();

    private Model(){

    }

    public interface getAllStudentsListener{
        void onComplete(List<Student> data);
    }

    public void getStudentList(getAllStudentsListener listener){
        MyApplication.executorService.execute(()->{
            List<Student> data = AppLocalDB.db.studentDao().getAll();
            MyApplication.mainHandler.post(()->{
                listener.onComplete(data);
            });
        });
    }

    public interface addStudentListener{
        void onComplete();
    }

    public void addNewStudent(Student student, addStudentListener listener){
        MyApplication.executorService.execute(()->{
            AppLocalDB.db.studentDao().insertAll(student);
            MyApplication.mainHandler.post(()->{
                listener.onComplete();
            });
        });
    }

    public interface deleteStudentListener{
        void onComplete();
    }

    public void deleteStudent(String studentId, deleteStudentListener listener){
//        MyApplication.executorService.execute(()->{
//            AppLocalDB.db.studentDao().delete(getStudentById(studentId));
//            MyApplication.mainHandler.post(()->{
//                listener.onComplete();
//            });
//        });
    }

    public interface getStudentByIdListener{
        void onComplete(Student student);
    }

    public void getStudentById(String studentId, getStudentByIdListener listener) {
        MyApplication.executorService.execute(() -> {
            Student student = AppLocalDB.db.studentDao().getStudentById(studentId);
            MyApplication.mainHandler.post(() -> {
                listener.onComplete(student);
            });
        });
    }
}
