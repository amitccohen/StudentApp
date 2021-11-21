package com.example.studentapp.Model;

public class Student {
    private String StudentName;
    private String StudentId;
    private String studentAddress;
    private String studentPhone;
    private boolean StudentCb;


    public Student(String studentName, String studentId, String studentAddress, String studentPhone, boolean studentCb) {
        StudentName = studentName;
        StudentId = studentId;
        this.studentAddress = studentAddress;
        this.studentPhone = studentPhone;
        StudentCb = studentCb;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getStudentId() {
        return StudentId;
    }

    public void setStudentId(String studentId) {
        StudentId = studentId;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    public boolean isStudentCb() {
        return StudentCb;
    }

    public void setStudentCb(boolean studentCb) {
        StudentCb = studentCb;
    }
}
