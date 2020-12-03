package com.sinosoft.mybatis01;

import com.sinosoft.mybatis01.model.Student;
import com.sinosoft.mybatis01.service.StudentService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootApplication
public class Mybatis01Application {

    public static void main(String[] args) {
        SpringApplication.run(Mybatis01Application.class, args);
    }

}



