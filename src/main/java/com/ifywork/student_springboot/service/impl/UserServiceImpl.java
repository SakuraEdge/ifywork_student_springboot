package com.ifywork.student_springboot.service.impl;

import com.ifywork.student_springboot.aspect.MD5Utils;
import com.ifywork.student_springboot.bean.User;
import com.ifywork.student_springboot.dao.UserDao;
import com.ifywork.student_springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User selectUserByUid(String uid) {
        return userDao.selectUserByUid(uid);
    }

    @Override
    public User checkUser(String uid, String pwd) {
        pwd = MD5Utils.getPWD(pwd);
        return userDao.checkUser(uid,pwd);
    }
}
