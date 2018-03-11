package com.ssm.dao;
import com.ssm.entity.Student;

public interface StudentDao {
    public int addStudent(Student student);
    public Student findStudentById(int id);
}
