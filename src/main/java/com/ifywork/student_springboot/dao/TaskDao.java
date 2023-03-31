package com.ifywork.student_springboot.dao;

import com.ifywork.student_springboot.bean.Task;
import com.ifywork.student_springboot.bean.TaskMutual;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TaskDao {

    @Select("select * from task t,class c where c.CLASS_NAME = #{cname} group by T_NAME")
    List<Task> selectTaskByClassName(@Param("cname") String className);


    @Select("select * from task t,user u where u.ID = #{id} and u.ID = t.T_STUDENT_ID")
    List<Task> selectStuTask(@Param("id") String id);

    @Select("select T_NAME from task where ID = #{taskID}")
    String selectTaskNameByTaskID(@Param("taskID") String taskID);

    @Select("select * from task_mutual where STUDENT_ID1 = #{id} or STUDENT_ID2 = #{id} or STUDENT_ID3 = #{id} or STUDENT_ID4 = #{id} or STUDENT_ID5 = #{id}")
    List<TaskMutual> selectStuMutual(@Param("id") String id);

}
