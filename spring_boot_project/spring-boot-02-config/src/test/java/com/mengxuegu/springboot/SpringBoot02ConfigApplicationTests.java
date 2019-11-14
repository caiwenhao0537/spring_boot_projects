package com.mengxuegu.springboot;

import com.mengxuegu.springboot.bean.Emp;
import com.mengxuegu.springboot.controller.EmpController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.security.RunAs;


@SpringBootTest
class SpringBoot02ConfigApplicationTests {

    @Autowired
    Emp emp;
    EmpController empController;

    @Test
    void contextLoads() {
        System.out.println(empController.sayHello());
    }

}
