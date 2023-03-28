package com.ifywork.student_springboot.service;

import com.ifywork.student_springboot.bean.User;


public interface UserService {


    User selectUserByUid(String uid);

    User checkUser(String uid,String pwd);
}
