package com.ifywork.student_springboot.service;

import com.ifywork.student_springboot.bean.Task;
import com.ifywork.student_springboot.bean.TaskMutual;

import java.util.List;
import java.util.Map;

public interface TaskService {

    List<Task> selectTaskByClassName(String cid);

    List<Task> selectStuTask(String uid);

    String selectTaskNameByTaskID(String taskID);

    List<TaskMutual> selectStuMutual(String id);

    List<Map<String,String>> selectTaskInfo(String id);

    int updateTaskFilePath(String taskID,String filePath);

    String getTaskOverPercent(String tCode);

}
