package com.ifywork.student_springboot.dao;

import com.ifywork.student_springboot.bean.Task;
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


    @Select("select * from task t,user u where u.U_ID = #{uid} and u.ID = t.T_STUDENT_ID ")
    List<Task> selectStuTask(@Param("uid") String uid);

}
