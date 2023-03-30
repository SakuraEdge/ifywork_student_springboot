package com.ifywork.student_springboot.dao;

import com.ifywork.student_springboot.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDao {
    @Select("select * from user where U_ID = #{uid}")
    User selectUserByUid(@Param("uid") String uid);

    @Select("select * from user where U_ID = #{uid} and U_PASSWORD = #{pwd}")
    User checkUser(@Param("uid") String uid, @Param("pwd") String pwd);

    @Select("select U_NAME from user where ID = #{uid}")
    String selectNameByUid(@Param("uid") Integer uid);
}
