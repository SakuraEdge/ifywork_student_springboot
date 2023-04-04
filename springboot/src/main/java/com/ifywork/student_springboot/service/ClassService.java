package com.ifywork.student_springboot.service;

import com.ifywork.student_springboot.bean.MyClass;

import java.util.List;

public interface ClassService {

    public List<MyClass> selectClassByStudentID(int id);
}
