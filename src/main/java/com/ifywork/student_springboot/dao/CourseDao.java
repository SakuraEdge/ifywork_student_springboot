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
    @Select("select * from course where id = any(select course_id from class_course where class_id = ${id})")
    public List<Course> selectCourseByClassID(@Param("id") int id);

    @Select("select COURSE_NAME from course where id = #{id}")
    String selectCourseNameByID(@Param("id") int id);

    @Select("select * from course where id = any(select course_id from class_course where class_id = ${id}) and term = #{term}" +
            "and year = #{year}")
    List<Course> selectCourseByTermAndYear(@Param("id") int id, @Param("term") String term, @Param("year") String year);

    @Select("select * from course where id = any(select course_id from class_course where class_id = ${id}) and course_name like '%${word}%'")
    List<Course> selectCourseByWord(@Param("id") int id, @Param("word") String word);
}