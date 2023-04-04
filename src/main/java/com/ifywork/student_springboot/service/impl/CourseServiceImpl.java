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

    @Override
    public List<Course> selectCourseByTermAndYear(int studentID, String term, String year) {
        List<MyClass> myClasses = classService.selectClassByStudentID(studentID);
        List<Course> courses = new ArrayList<>();

        for (MyClass myClass:
                myClasses) {
            courses.addAll(courseDao.selectCourseByTermAndYear(myClass.getId(),term,year));
        }

        return courses;
    }

    @Override
    public List<Course> selectCourseByWord(int studentID, String word) {
        List<MyClass> myClasses = classService.selectClassByStudentID(studentID);
        List<Course> courses = new ArrayList<>();

        for (MyClass myClass:
                myClasses) {
            courses.addAll(courseDao.selectCourseByWord(myClass.getId(),word));
        }

        return courses;
    }
    @Override
    public int selectCourseNum(int studentID){
        return  selectCourseByStudentID(studentID).size();
    }

    @Override
    public int selectCourseNumByTag(int studentID,int tag){
        List<Course> courses = selectCourseByStudentID(studentID);

        int num = 0;
        for (Course course:
             courses) {
            if(course.getCOURSE_ONLINE() == tag){
                num++;
            }
        }
        return num;
    }
}
