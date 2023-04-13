package com.ifywork.student_springboot.service;

import com.ifywork.student_springboot.bean.Task;
import com.ifywork.student_springboot.bean.TaskMutual;

import java.util.List;
import java.util.Map;

public interface TaskService {

    List<Task> selectTaskByClassName(String cname);

    List<Task> selectTaskByCourseID(String id,String cid);

    Map<String,String>  selectTaskByTCode(String studentID,String tCode);

    List<Task> selectStuTask(String uid);


    String selectTaskNameByTaskID(String taskID);

    Task selectTaskByID(String id);

    List<TaskMutual> selectStuMutual(String id);

    TaskMutual selectTaskMutual(String id);

    List<Map<String,String>> selectTaskInfo(String id);

    List<Map<String,String>> selectTaskInfoByCourseID(String id,String courseID);

    int updateTaskFilePath(String taskID,String filePath);

    String getTaskOverPercent(String tCode);

    List<Map<String,String>> selectTaskMutualInfo(String studentID);

}
