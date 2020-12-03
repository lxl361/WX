package com.sinosoft.mybatis01;

import com.sinosoft.mybatis01.model.Student;
import com.sinosoft.mybatis01.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Mybatis01ApplicationTests {
    //调用的是接口
    @Autowired
    StudentService StudentService;
    //测试查询
    @Test
    void getall() {
        List<Student> list = StudentService.allStudents ();
        list.forEach (System.out::println);
    }
}
