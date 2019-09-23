package com.example.freemarker.model;


import java.util.ArrayList;
import java.util.List;

//Model = Java object in template


public class Student {
    private Integer Id;
    private String studentName;
    private double grade;

    //add student constructor
    public Student(){};

    public Student(Integer id, String studentName, double grade) {
        this.Id = id;
        this.studentName = studentName;
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getId() { return Id; }

    public void setId(Integer id) {
        Id = id;
    }
}