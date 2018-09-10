package com.amon.springboot.web.service;

import com.amon.springboot.web.mapper.UserMapper;
import com.amon.springboot.web.model.Users;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * yaming.chen@siemens.com
 *
 * @author chenyaming
 * @date 2016/10/25
 */
@Service
public class UsersServiceB {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserMapper userMapper;



    /**
     * Save Default User
     */
    @Transactional(rollbackFor = Exception.class,propagation = Propagation.REQUIRED)
    public void saveDefaultUser() {

        Users users = new Users();
        users.setDepartment("Department");
        users.setEmployeenum("Employeenum");
        users.setUsername("DefaultUser");
        users.setPasswd("123456");
        users.setTruename("DefaultUser");
        users.setSex(0);
        users.setIsdistributed(1);

        userMapper.insert(users);

        throw new RuntimeException("SaveDefaultUser Error");

    }


}
