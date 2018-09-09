package com.amon.springboot.web.service;

import com.amon.springboot.web.mapper.UserMapper;
import com.amon.springboot.web.model.Users;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * yaming.chen@siemens.com
 *
 * @author chenyaming
 * @date 2016/10/25
 */
@Service
public class UsersService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserMapper userMapper;

    /**
     * Save user
     * @param users
     * @return
     */
    public boolean saveUser(Users users){

        if (null!=users){

            if (userMapper.insert(users)==1){
                return true;
            }else {
                return false;
            }

        }else {
            return false;
        }

    }


}
