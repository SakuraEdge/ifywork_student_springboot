package com.ifywork.student_springboot.service.impl;

import com.ifywork.student_springboot.bean.User;
import com.ifywork.student_springboot.dao.LoginDao;
import com.ifywork.student_springboot.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginDao loginDao;

    @Override
    public User selectUserByUid(String uid) {
        return loginDao.selectUserByUid(uid);
    }
}
