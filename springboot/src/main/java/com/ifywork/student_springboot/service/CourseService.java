package com.ifywork.student_springboot.service;

import com.ifywork.student_springboot.bean.Course;

import java.util.List;
import java.util.Map;

public interface CourseService {

    public List<Course> selectCourseByStudentID(int id);

    public List<Course> selectCourseByClassID(int id);

    public List<Course> selectCourseByStudentUID(String uid);

    public List<Map<String,String>> selectCourseByTermAndYear(int studentID, String term, String year);

    public List<Course> selectCourseByWord(int studentID,String word);

    public int selectCourseNum(int studentID);

    public String selectCourseNameByClassID(int id);

    public int selectCourseNumByTag(int studentID,int tag);
}
