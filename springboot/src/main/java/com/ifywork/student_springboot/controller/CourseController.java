package com.ifywork.student_springboot.controller;

import com.ifywork.student_springboot.aspect.CommonResp;
import com.ifywork.student_springboot.aspect.DataIsNull;
import com.ifywork.student_springboot.bean.Course;
import com.ifywork.student_springboot.service.CourseService;
import com.ifywork.student_springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    CourseService courseService;

    @Autowired
    UserService service;

    /**
     * 通过学生ID查询该学生所在的所有课程
     * @param map
     * @return List
     */
    @PostMapping("/selectCourseByStudentID")
    public CommonResp<List<Course>> selectCourseByStudentID(@RequestBody Map<String,String> map){
        int id = Integer.parseInt(map.get("id"));

        List<Course> courses = courseService.selectCourseByStudentID(id);
        DataIsNull<Course> dataIsNull = new DataIsNull<>();
        return dataIsNull.listIsNull(courses);
    }

    /**
     * 通过班级ID查询该班级下所有课程
     * @param map
     * @return List
     */
    @PostMapping("/selectCourseByClassID")
    public CommonResp<List<Course>> selectCourseByClassID(@RequestBody Map<String,String> map){
        int id = Integer.parseInt(map.get("id"));

        List<Course> courses = courseService.selectCourseByClassID(id);
        DataIsNull<Course> dataIsNull = new DataIsNull<>();
        return dataIsNull.listIsNull(courses);
    }

    /**
     * 通过学生UID查询该学生所有课程
     * @param map
     * @return List
     */
    @PostMapping("/selectCourseByStudentUID")
    public CommonResp<List<Course>> selectCourseByStudentUID(@RequestBody Map<String,String> map){
        String uid = map.get("uid");

        List<Course> courses = courseService.selectCourseByStudentUID(uid);

        DataIsNull<Course> dataIsNull = new DataIsNull<>();
        return dataIsNull.listIsNull(courses);
    }

    /**
     * 通过学生ID与学年筛选该学生课程
     * @param map
     * @return List
     */
    @PostMapping("/selectCourseByTermAndYear")
    public CommonResp<List<Map<String,String>>> selectCourseByStudentIDAndTerm(@RequestBody Map<String,String> map){
        int id = Integer.parseInt(map.get("id"));
        String term = map.get("term");
        String year = map.get("year");

        List<Map<String,String>> courses = courseService.selectCourseByTermAndYear(id,term,year);


        DataIsNull<Map<String,String>> dataIsNull = new DataIsNull<>();
        return dataIsNull.listIsNull(courses);

    }

    /**
     * 通过学生ID与关键词查询该学生课程
     * @param map
     * @return List
     */
    @PostMapping("/selectCourseByWord")
    public CommonResp<List<Course>> selectCourseByWord(@RequestBody Map<String,String> map){
        int id = Integer.parseInt(map.get("id"));
        String word = map.get("word");

        List<Course> courses = courseService.selectCourseByWord(id,word);

        DataIsNull<Course> dataIsNull = new DataIsNull<>();
        return dataIsNull.listIsNull(courses);
    }

    @PostMapping("/selectCourseNum")
    public CommonResp<Map<String,String>> selectCourseNum(@RequestBody Map<String,String> map){
        int id = Integer.parseInt(map.get("id"));

        Map<String,String> retMap = new HashMap<>();
        retMap.put("all",Integer.toString(courseService.selectCourseNum(id)));
        retMap.put("online",Integer.toString(courseService.selectCourseNumByTag(id,1)));
        retMap.put("notOnline",Integer.toString(courseService.selectCourseNumByTag(id,0)));
        DataIsNull<Map<String,Integer>> dataIsNull = new DataIsNull<>();
        return dataIsNull.mapIsNull(retMap);
    }
}
