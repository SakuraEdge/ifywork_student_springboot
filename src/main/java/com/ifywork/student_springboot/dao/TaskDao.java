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

    @Select("select * from task where T_CLASS_ID = #{cid} group by T_NAME")
    List<Task> selectTaskByClassID(@Param("cid") String classID);


    @Select("select * from task where T_STUDENT_ID = #{uid} where T_ACTIVE = '0'")
    List<Task> selectStuNoTask(@Param("uid") String uid);

}
