package com.sinosoft.mybatis01.serviceImpl;

import com.sinosoft.mybatis01.dao.StudentDao;
import com.sinosoft.mybatis01.model.Student;
import com.sinosoft.mybatis01.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//学生服务处实现
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
     StudentDao studentDao;
    @Override
    public List<Student> allStudents() {
        return studentDao.allStudents();
    }
}
