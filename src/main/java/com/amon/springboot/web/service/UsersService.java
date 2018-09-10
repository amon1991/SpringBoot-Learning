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
public class UsersService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UsersServiceB usersServiceB;

    /**
     * Save user
     *
     * @param users
     * @return
     */
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    public boolean saveUser(Users users) {

        try {
            if (null != users) {

                if (userMapper.insert(users) == 1) {
                    usersServiceB.saveDefaultUser();
                    return true;
                } else {
                    return false;
                }

            } else {
                return false;
            }
        }catch (Exception e){

            e.getStackTrace();
            logger.error(e.getMessage());
            //return false;
            throw new RuntimeException(e.getMessage());

        }

    }



}
