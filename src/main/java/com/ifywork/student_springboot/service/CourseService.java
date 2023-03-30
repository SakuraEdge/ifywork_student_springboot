package com.ifywork.student_springboot.service;

import com.ifywork.student_springboot.bean.Course;

import java.util.List;

public interface CourseService {

    public List<Course> selectCourseByStudentID(int id);

    public List<Course> selectCourseByClassID(int id);

    public List<Course> selectCourseByStudentUID(String uid);
}
