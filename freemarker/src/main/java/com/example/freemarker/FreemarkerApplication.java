package com.example.freemarker;

import com.example.freemarker.controller.StudentList;
import com.example.freemarker.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

// run application
// in browser: http://localhost:8080/list

@SpringBootApplication
@Controller
@ComponentScan(basePackageClasses = StudentList.class)
@ComponentScan(basePackageClasses = Student.class)
public class FreemarkerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FreemarkerApplication.class, args);
    }

}
