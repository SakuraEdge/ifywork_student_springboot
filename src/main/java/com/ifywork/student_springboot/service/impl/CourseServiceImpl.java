package com.ifywork.student_springboot.service.impl;

import com.ifywork.student_springboot.bean.Course;
import com.ifywork.student_springboot.bean.MyClass;
import com.ifywork.student_springboot.dao.CourseDao;
import com.ifywork.student_springboot.service.ClassService;
import com.ifywork.student_springboot.service.CourseService;
import com.ifywork.student_springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseDao courseDao;

    @Autowired
    ClassService classService;

    @Autowired
    UserService userService;

    @Override
    public List<Course> selectCourseByStudentID(int id) {
        List<MyClass> myClasses = classService.selectClassByStudentID(id);
        List<Course> courses = new ArrayList<>();

        for (MyClass myClass:
             myClasses) {
            courses.addAll(courseDao.selectCourseByClassID(myClass.getId()));
        }

        return courses;
    }

    @Override
    public List<Course> selectCourseByClassID(int id) {
        return courseDao.selectCourseByClassID(id);
    }
    @Override
    public List<Course> selectCourseByStudentUID(String uid) {
        int id = userService.selectUserByUid(uid).getId();
        return  selectCourseByStudentID(id);
    }
}
