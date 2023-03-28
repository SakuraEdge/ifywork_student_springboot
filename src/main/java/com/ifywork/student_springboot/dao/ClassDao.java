package com.ifywork.student_springboot.dao;

import com.ifywork.student_springboot.bean.MyClass;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ClassDao {

    @Select("select * from class where id = (select class_id from class_student where student_id = ${id}) ;")
    List<MyClass> selectClassByStudentID(@Param("id") int id);
}
