package com.ifywork.student_springboot.service.impl;

import com.ifywork.student_springboot.bean.MyClass;
import com.ifywork.student_springboot.dao.ClassDao;
import com.ifywork.student_springboot.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassServiceImpl implements ClassService {

    @Autowired
    private ClassDao classDao;

    @Override
    public List<MyClass> selectClassByStudentID(int id){
        return classDao.selectClassByStudentID(id);
    }

    @Override
    public String selectClassNameByCourseID(int id) {
        return classDao.selectClassNameByCourseID(id);
    }

}
