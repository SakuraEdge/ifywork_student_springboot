package com.ifywork.student_springboot.dao;

import com.ifywork.student_springboot.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface LoginDao {
    @Select("select * from user where U_ID = ${uid}")
    User selectUserByUid(@Param("uid") String Uid);
}
