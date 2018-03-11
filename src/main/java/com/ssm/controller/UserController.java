package com.ssm.controller;

import com.ssm.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @PostMapping("/user")
    public Student josn(Student student){
        System.out.println(student);
        return student;
    }
}
