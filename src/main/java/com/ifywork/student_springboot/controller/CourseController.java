package com.ifywork.student_springboot.controller;

import com.ifywork.student_springboot.aspect.CommonResp;
import com.ifywork.student_springboot.bean.Course;
import com.ifywork.student_springboot.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    CourseService courseService;

    @PostMapping("/selectCourseByStudentID")
    public CommonResp<List<Course>> selectCourseByStudentID(@RequestBody Map<String,String> map){
        int id = Integer.parseInt(map.get("id"));

        List<Course> courses = courseService.selectCourseByStudentID(id);
        CommonResp<List<Course>> commonResp = new CommonResp<>();
        commonResp.setResult(courses);
        commonResp.setCode(200);
        commonResp.setMsg("成功");
        return commonResp;
    }

    @PostMapping("/selectCourseByClassID")
    public CommonResp<List<Course>> selectCourseByClassID(@RequestBody Map<String,String> map){
        int id = Integer.parseInt(map.get("id"));

        List<Course> courses = courseService.selectCourseByClassID(id);
        CommonResp<List<Course>> commonResp = new CommonResp<>();
        commonResp.setResult(courses);
        commonResp.setCode(200);
        commonResp.setMsg("成功");
        return commonResp;
    }

    @PostMapping("/selectCourseByStudentUID")
    public CommonResp<List<Course>> selectCourseByStudentUID(@RequestBody Map<String,String> map){
        String uid = map.get("uid");

        List<Course> courses = courseService.selectCourseByStudentUID(uid);
        CommonResp<List<Course>> commonResp = new CommonResp<>();
        commonResp.setResult(courses);
        commonResp.setCode(200);
        commonResp.setMsg("成功");
        return commonResp;
    }
}
