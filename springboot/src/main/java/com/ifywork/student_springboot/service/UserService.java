package com.ifywork.student_springboot.service;

import com.ifywork.student_springboot.bean.User;


public interface UserService {


    User selectUserByUid(String uid);

    User checkUser(String uid,String pwd);

    String selectUserNameByID(int id);

    User selectUserByID(int id);
}
