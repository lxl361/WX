package com.sinosoft.mybatis01.dao;

import com.sinosoft.mybatis01.model.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
//学生接口层
@Mapper
public interface StudentDao {
    /*学生的查询方法*/
    List<Student> allStudents();
}
