package com.ifywork.student_springboot.service.impl;

import com.ifywork.student_springboot.bean.Task;
import com.ifywork.student_springboot.bean.TaskMutual;
import com.ifywork.student_springboot.dao.ClassDao;
import com.ifywork.student_springboot.dao.CourseDao;
import com.ifywork.student_springboot.dao.UserDao;
import com.ifywork.student_springboot.service.TaskService;
import com.ifywork.student_springboot.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class WorkServiceImpl implements WorkService {

    @Autowired
    private TaskService taskService;

    @Autowired
    private UserDao userDao;
    @Autowired
    private CourseDao courseDao;

    @Override
    public List<Map<String,String>> selectStuWork(String id) {
        List<Task> list = taskService.selectStuTask(id);
        List<Map<String,String>> list1 = new ArrayList<>();
        for (Task task:list) {
            Map<String,String> map = new HashMap<>();
            map.put("t_name",task.getT_NAME());

            map.put("t_teacher_name",userDao.selectNameById(task.getT_TEACHER_ID()));
            map.put("t_student_name",userDao.selectNameById(task.getT_STUDENT_ID()));
            map.put("course_name", courseDao.selectCourseNameByID(task.getT_COURSE_ID()));

            String active = task.getT_ACTIVE();
            if ("0".equals(active)){
                map.put("active","未完成");
            } else if ("2".equals(active)) {
                map.put("active","被打回");
            }
            else {
                int num = Integer.parseInt(task.getT_SCORE_TYPE());
                if (num/10%10 == 1){
                    if (task.getT_SELF_SCORE() != null){
                        map.put("active","已完成");
                    }
                    else{
                        map.put("active","未自评");
                    }
                }
                else {
                    map.put("active","已完成");
                }
            }
            list1.add(map);
        }
        return list1;
    }

    @Override
    public List<Map<String,String>> selectMutualWork(String id){
        List<TaskMutual> list = taskService.selectStuMutual(id);
        List<Map<String,String>> list1 = new ArrayList<>();
        for (TaskMutual mutual:list){
            Map<String,String> map = new HashMap<>();
            map.put("t_name",taskService.selectTaskNameByTaskID(mutual.getT_ID().toString()));
            if (mutual.getMUTUAL_SCORE()!=null)
            {
                map.put("mutual_score",mutual.getMUTUAL_SCORE().toString());
                map.put("active","已互评");
            }
            else {
                map.put("mutual_score",null);
                map.put("active","未互评");
            }
            list1.add(map);
        }
        return list1;
    }
}
