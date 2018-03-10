package com.ssm.po;

import com.ssm.dao.StudentMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
    @Test
    public void find(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        StudentMapper studentMapper = applicationContext.getBean(StudentMapper.class);
        Student student = studentMapper.findStudentById(1);
        System.out.println(student);
    }
}
