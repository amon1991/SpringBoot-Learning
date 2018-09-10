package com.amon.springboot.web.service;

import com.amon.springboot.web.model.Users;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * yaming.chen@siemens.com
 * Created by chenyaming on 2018/9/9.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UsersServiceTest {

    @Autowired
    private UsersService usersService;


    @Test
    public void saveUser() {

        Users users = new Users();
        users.setDepartment("Department");
        users.setEmployeenum("Employeenum");
        users.setUsername("Eason");
        users.setPasswd("123456");
        users.setTruename("Amon");
        users.setSex(0);
        users.setIsdistributed(1);

        Assert.assertTrue(usersService.saveUser(users));

    }
}