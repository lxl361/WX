package com.sinosoft.mybatis01.service;

import com.sinosoft.mybatis01.model.Student;

import java.util.List;

//学生服务层
public interface StudentService {
    List<Student> allStudents();
}
