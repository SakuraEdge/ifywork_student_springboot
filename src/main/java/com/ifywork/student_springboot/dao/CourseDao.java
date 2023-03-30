package com.ifywork.student_springboot.dao;

import com.ifywork.student_springboot.bean.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CourseDao {
    @Select("select * from course where id = (select course_id from class_course where class_id = ${id})")
    public List<Course> selectCourseByClassID(@Param("id") int id);
}
