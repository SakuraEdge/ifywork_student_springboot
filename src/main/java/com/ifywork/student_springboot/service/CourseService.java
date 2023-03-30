package com.ifywork.student_springboot.service;

import com.ifywork.student_springboot.bean.Course;

import java.util.List;

public interface CourseService {

    public List<Course> selectStudentByStudentID(int id);

    public List<Course> selectStudentByClassID(int id);
}
