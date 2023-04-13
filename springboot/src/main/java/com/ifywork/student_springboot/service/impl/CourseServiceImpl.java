package com.ifywork.student_springboot.service.impl;

import com.ifywork.student_springboot.bean.Course;
import com.ifywork.student_springboot.bean.MyClass;
import com.ifywork.student_springboot.dao.CourseDao;
import com.ifywork.student_springboot.service.ClassService;
import com.ifywork.student_springboot.service.CourseService;
import com.ifywork.student_springboot.service.UserService;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseDao courseDao;


    @Autowired
    ClassService classService;

    @Autowired
    UserService userService;

    @Override
    public String selectCourseNameByID(int id) {
        return courseDao.selectCourseNameByID(id);
    }

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
    public List<Map<String,String>> selectCourseByTermAndYear(int studentID, String term, String year) {
        List<MyClass> myClasses = classService.selectClassByStudentID(studentID);
        List<Course> courses = new ArrayList<>();

        if("0".equals(term) && "0".equals(year)){
            for (MyClass myClass:myClasses){
                courses.addAll(courseDao.selectCourseByNull(myClass.getId()));
            }
        }
        else if ("0".equals(term)) {
            for (MyClass myClass : myClasses) {
                courses.addAll(courseDao.selectCourseByYear(myClass.getId(), year));
            }
        }
        else if ("0".equals(year)){
            for (MyClass myClass:myClasses){
                courses.addAll(courseDao.selectCourseByTerm(myClass.getId(),term));
            }
        }
        else {
            for (MyClass myClass:
                    myClasses) {
                courses.addAll(courseDao.selectCourseByTermAndYear(myClass.getId(),term,year));
            }
        }


        List<Map<String,String>> list = new ArrayList<>();

        for (Course course:courses) {
            Map<String,String> map1 = new HashMap<>();
            map1.put("id",course.getId().toString());
            map1.put("courseName",course.getCOURSE_NAME());
            map1.put("mainTeacher",userService.selectUserNameByID(Integer.parseInt(course.getTEACHER_MAIN_ID())));
            if (course.getTEACHER_ASSIST_ID()!=null){
                String ass = course.getTEACHER_ASSIST_ID();
                String[] s1 = ass.split(",",0);
                StringBuffer sb = new StringBuffer();
                for (String s:s1) {
                    sb.append(userService.selectUserNameByID(Integer.parseInt(s))).append(",");
                }
                String assist = sb.deleteCharAt(sb.length() - 1).toString();
                map1.put("assistTeacher",assist);
            }
            else{
                map1.put("assistTeacher",null);
            }
            map1.put("time",null);
            if (course.getCOURSE_ONLINE() == 0){
                map1.put("type","面授课");
                map1.put("code", null);
            }
            else{
                map1.put("type","直播课");
                map1.put("code", course.getONLINE_CODE());
            }

            map1.put("className",classService.selectClassNameByCourseID(course.getId()));

            String status = course.getCOURSE_STATUS();
            if ("1".equals(status)){
                map1.put("status","进行中");
            }
            else {
                map1.put("status","未进行");
            }

            map1.put("year",course.getYEAR());
            map1.put("term",course.getTERM());

            list.add(map1);
        }


        return list;
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
    public String selectCourseNameByClassID(int id) {
        return courseDao.selectCourseNameByID(id);
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
