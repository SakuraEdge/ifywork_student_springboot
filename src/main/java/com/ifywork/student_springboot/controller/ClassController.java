package com.ifywork.student_springboot.controller;

import com.ifywork.student_springboot.aspect.CommonResp;
import com.ifywork.student_springboot.aspect.DataIsNull;
import com.ifywork.student_springboot.bean.Course;
import com.ifywork.student_springboot.bean.MyClass;
import com.ifywork.student_springboot.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/class")
public class ClassController {

    @Autowired
    ClassService classService;

    /**
     * 通过学生ID查询该学生所在的所有班级
     * @param map
     * @return List
     */
    @PostMapping("/selectClassByStudentID")
    public CommonResp<List<MyClass>> selectClassByStudentUID(@RequestBody Map<String,String> map){
        String sid = map.get("id");
        int id = Integer.parseInt(sid);

        List<MyClass> myClass = classService.selectClassByStudentID(id);

        DataIsNull<MyClass> dataIsNull = new DataIsNull<>();
        return dataIsNull.listIsNull(myClass);
    }
}
