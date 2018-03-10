package com.ssmtest.mapper;
import com.ssmtest.po.Student;

public interface StudentMapper {
//    public int addStudent(Student student);
    public Student findStudentById(int id);
}
