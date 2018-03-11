package com.ssm.entity;

import com.ssm.dao.StudentDao;
import com.ssm.service.imp.StudentServiceImpl;
import com.ssm.service.inter.StudentService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest{
//    @Test
//    public void find(){
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/spring-mybatis.xml");
//        StudentDao studentDao = applicationContext.getBean(StudentDao.class);
//        Student student = studentDao.findStudentById(19);
//        System.out.println(student);
//    }

//    @Autowired
//    private StudentDao studentDao;
    @Test
    public void add(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/spring-mybatis.xml");
        StudentDao studentDao = applicationContext.getBean(StudentDao.class);
        Student student = new Student();
        student.setName("lm");
        student.setNumber("5231");
        System.out.println(student);

        int n = studentDao.addStudent(student);
        System.out.println(n);
    }

//    @Test
//    public void addStudentServiceTest(){
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/spring-mybatis.xml");
//        StudentService studentService = applicationContext.getBean(StudentServiceImpl.class);
//        Student student = new Student();
//        student.setName("wtwt");
//        student.setNumber("4353634");
//        System.out.println(student);
//
//        int n = studentService.addStudent(student);
//        System.out.println(n);
//    }
}
