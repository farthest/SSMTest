package com.ssm.service.imp;

import com.ssm.dao.StudentDao;
import com.ssm.entity.Student;
import com.ssm.service.inter.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;
    public int addStudent(Student student){
        int re = this.studentDao.addStudent(student);
//        int i=1/0;
        return re;
    }
}
