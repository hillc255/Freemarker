package com.example.freemarker.controller;

import com.example.freemarker.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

//Controller: creates input for template

@Controller
public class StudentList {

    private static List<Student> students = new ArrayList<>();

    static {
        students.add(new Student(1, "Tom", 80.5));
        students.add(new Student(2, "Jerry", 90.4));
        students.add(new Student(3, "Paul", 77.5));
    }

    @RequestMapping({"list"})
    public String list(Model model) {

        model.addAttribute("students", students);
        return "list";
    }
}