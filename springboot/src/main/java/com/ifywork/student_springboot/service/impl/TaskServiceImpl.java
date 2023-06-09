package com.ifywork.student_springboot.service.impl;

import com.ifywork.student_springboot.bean.Task;
import com.ifywork.student_springboot.bean.TaskMutual;
import com.ifywork.student_springboot.dao.TaskDao;
import com.ifywork.student_springboot.service.CourseService;
import com.ifywork.student_springboot.service.TaskService;
import com.ifywork.student_springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskDao taskDao;

    @Autowired
    private CourseService courseService;

    @Autowired
    private UserService userService;

    @Override
    public List<Task> selectTaskByClassName(String cname) {
        return taskDao.selectTaskByClassName(cname);
    }

    @Override
    public List<Task> selectTaskByCourseID(String id, String cid) {
        return null;
    }

    @Override
    public List<Task> selectStuTask(String id) {
        return taskDao.selectStuTask(id);
    }

    @Override
    public String selectTaskNameByTaskID(String taskID) {
        return taskDao.selectTaskNameByTaskID(taskID);
    }

    @Override
    public Task selectTaskByID(String id) {
        return taskDao.selectTaskByID(id);
    }

    @Override
    public List<TaskMutual> selectStuMutual(String id) {
        return taskDao.selectStuMutual(id);
    }

    @Override
    public  TaskMutual selectTaskMutual(String id){return  taskDao.selectTaskMutual(id);}

    @Override
    public List<Map<String, String>> selectTaskInfo(String id) {
        List<Map<String,String>> list = new ArrayList<>();


        List<Task> tasks = selectStuTask(id);

        for (Task task:tasks){
            Map<String,String> map = new HashMap<>();
            map.put("course",courseService.selectCourseNameByClassID(task.getT_COURSE_ID()));
            map.put("tName",task.getT_NAME());
            map.put("createTime",task.getCREATED_TIME());
            map.put("teacher",userService.selectUserNameByID(task.getT_TEACHER_ID()));
            map.put("endTime",task.getT_SUBMIT_TIME());
            map.put("tCode",task.getT_CODE());

            map.put("percent",getTaskOverPercent(task.getT_CODE()));

            int type = Integer.parseInt(task.getT_SCORE_TYPE());
            if (type/10%10==1){
                map.put("T_TIME_OTHER",task.getT_TIME_OTHER());
                if (task.getT_TEACHER_SCORE()!=null){
                    map.put("T_TEACHER_SCORE",task.getT_TEACHER_SCORE().toString());
                }
                else{
                    map.put("T_TEACHER_SCORE",null);
                }
            }
            else {
                map.put("T_TIME_OTHER",null);
                if (task.getT_TEACHER_SCORE()!=null){
                    map.put("T_TEACHER_SCORE",task.getT_TEACHER_SCORE().toString());
                }
                else{
                    map.put("T_TEACHER_SCORE",null);
                }
            }
            map.put("tReSubmit",task.getT_RESUBMIT());
            map.put("active",task.getT_ACTIVE());
            map.put("type",task.getT_TYPE());

            list.add(map);

        }

        return list;
    }

    @Override
    public List<Map<String, String>> selectTaskInfoByCourseID(String id, String courseID) {
        return null;
    }

    @Override
    public int updateTaskFilePath(String taskID, String filePath) {
        return taskDao.updateTaskFilePath(taskID,filePath);
    }

    @Override
    public String getTaskOverPercent(String tCode) {
        List<Task> list = taskDao.selectTaskByCode(tCode);
        int num = 0,sum = 0;
        for (Task task:list) {
            if ("1".equals(task.getT_ACTIVE())){
                num++;
            }
            sum++;
        }

        double percent = (double)num / (double)sum * 100;
        return percent+"%";
    }

    @Override
    public List<Map<String, String>> selectTaskMutualInfo(String studentID) {
        List<TaskMutual> taskMutuals = selectStuMutual(studentID);

        List<Map<String,String>> ret = new ArrayList<>();

        for (TaskMutual taskMutal:
             taskMutuals) {
            Task task = selectTaskByID(taskMutal.getT_ID().toString());
            Map<String,String> map = new HashMap<>();
            map.put("tName",task.getT_NAME());
            map.put("tType",task.getT_TYPE());
            map.put("teacherName",userService.selectUserNameByID(task.getT_TEACHER_ID()));
            map.put("createTime",taskMutal.getCREATED_TIME());
            map.put("overTime",task.getT_TIME_OTHER());
            String str = null;
            if(taskMutal.getMUTUAL_SCORE() != null){
                str = taskMutal.getMUTUAL_SCORE().toString();
            }
            map.put("score",str);
            ret.add(map);
        }

        return  ret;
    }

    @Override
    public Map<String, String> selectTaskByTCode(String studentID, String tCode) {
        Task task = taskDao.selectTaskByTCode(tCode,studentID);
        Map<String,String> map = new HashMap<>();

        map.put("id",task.getId().toString());
        map.put("name",task.getT_NAME());
        map.put("teacherName",userService.selectUserNameByID(task.getT_TEACHER_ID()));
        map.put("speakName",task.getT_TEACHER_SPEAK_NAME());
        map.put("courseName", courseService.selectCourseNameByID(task.getT_COURSE_ID()));
        map.put("releaseTime",task.getT_RELEASE_TIME());
        map.put("submitTime",task.getT_SUBMIT_TIME());
        map.put("active",task.getT_ACTIVE());
        map.put("overPercent",getTaskOverPercent(tCode));
        return map;
    }
}
