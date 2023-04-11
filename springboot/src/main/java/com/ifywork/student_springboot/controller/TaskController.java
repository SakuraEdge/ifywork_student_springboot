package com.ifywork.student_springboot.controller;

import com.ifywork.student_springboot.aspect.CommonResp;
import com.ifywork.student_springboot.aspect.DataIsNull;
import com.ifywork.student_springboot.bean.Course;
import com.ifywork.student_springboot.bean.Task;
import com.ifywork.student_springboot.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    /**
     * 通过课程名查询该课程下的任务
     * @param map
     * @return List
     */
    @PostMapping("/selectTaskByCourseName")
    public CommonResp<List<Task>> selectTaskByClassID(@RequestBody Map<String,String> map){
        String name = map.get("courseName");

        List<Task> list = taskService.selectTaskByClassName(name);

        DataIsNull<Task> dataIsNull = new DataIsNull<>();
        return dataIsNull.listIsNull(list);
    }

    /**
     * 通过学生ID查询该学生下的任务
     * @param map
     * @return List
     */
    @PostMapping("/selectStuTask")
    public CommonResp<List<Task>> selectStuTask(@RequestBody Map<String,String> map){
        String id = map.get("id");

        List<Task> list = taskService.selectStuTask(id);

        DataIsNull<Task> dataIsNull = new DataIsNull<>();
        return dataIsNull.listIsNull(list);
    }

    /**
     * 通过学生ID查询该学生下的任务信息
     * @param map
     * @return List
     */
    @PostMapping("/selectTaskInfo")
    public CommonResp<List<Map<String,String>>> selectTaskInfo(@RequestBody Map<String,String> map){
        String id = map.get("id");
        List<Map<String,String>> lists = taskService.selectTaskInfo(id);

        DataIsNull<Map<String,String>> dataIsNull = new DataIsNull<>();

        return dataIsNull.listIsNull(lists);
    }

    @PostMapping("/selectTaskInfoByCourseID")
    public CommonResp<List<Map<String,String>>> selectTaskInfoByCourseID(@RequestBody Map<String,String> map){
        String id = map.get("id");
        String courseID = map.get("cid");
        List<Map<String,String>> lists = taskService.selectTaskInfoByCourseID(id,courseID);

        DataIsNull<Map<String,String>> dataIsNull = new DataIsNull<>();

        return dataIsNull.listIsNull(lists);
    }

    @PostMapping("/selectTaskMutualInfo")
    public CommonResp<List<Map<String,String>>> selectTaskMutualInfo(@RequestBody Map<String,String> map){
        String id = map.get("id");
        List<Map<String,String>> lists = taskService.selectTaskMutualInfo(id);

        DataIsNull<Map<String,String>> dataIsNull = new DataIsNull<>();

        return dataIsNull.listIsNull(lists);
    }
}
