package com.ifywork.student_springboot.bean;

import java.io.Serializable;
import java.util.Date;

public class TaskMutual implements Serializable{
    /** 创建人 */
    private String createdBy ;
    /** 创建时间 */
    private Date createdTime ;
    /** 更新人 */
    private String updatedBy ;
    /** 更新时间 */
    private Date updatedTime ;
    /** 主键 */
    private Integer id ;
    /** 任务id;外键，连接task表id */
    private Integer tId ;
    /** 互评人id一;外键，连接user表id */
    private Integer studentId1 ;
    /** 互评人id二;外键，连接user表id */
    private Integer studentId2 ;
    /** 互评人id三;外键，连接user表id */
    private Integer studentId3 ;
    /** 互评人id四;外键，连接user表id */
    private Integer studentId4 ;
    /** 互评人id五;外键，连接user表id */
    private Integer studentId5 ;
    /** 互评成绩一 */
    private Integer mutualScore1 ;
    /** 互评成绩二 */
    private Integer mutualScore2 ;
    /** 互评成绩三 */
    private Integer mutualScore3 ;
    /** 互评成绩四 */
    private Integer mutualScore4 ;
    /** 互评成绩五 */
    private Integer mutualScore5 ;

    /** 创建人 */
    public String getCreatedBy(){
        return this.createdBy;
    }
    /** 创建人 */
    public void setCreatedBy(String createdBy){
        this.createdBy = createdBy;
    }
    /** 创建时间 */
    public Date getCreatedTime(){
        return this.createdTime;
    }
    /** 创建时间 */
    public void setCreatedTime(Date createdTime){
        this.createdTime = createdTime;
    }
    /** 更新人 */
    public String getUpdatedBy(){
        return this.updatedBy;
    }
    /** 更新人 */
    public void setUpdatedBy(String updatedBy){
        this.updatedBy = updatedBy;
    }
    /** 更新时间 */
    public Date getUpdatedTime(){
        return this.updatedTime;
    }
    /** 更新时间 */
    public void setUpdatedTime(Date updatedTime){
        this.updatedTime = updatedTime;
    }
    /** 主键 */
    public Integer getId(){
        return this.id;
    }
    /** 主键 */
    public void setId(Integer id){
        this.id = id;
    }
    /** 任务id;外键，连接task表id */
    public Integer getTId(){
        return this.tId;
    }
    /** 任务id;外键，连接task表id */
    public void setTId(Integer tId){
        this.tId = tId;
    }
    /** 互评人id一;外键，连接user表id */
    public Integer getStudentId1(){
        return this.studentId1;
    }
    /** 互评人id一;外键，连接user表id */
    public void setStudentId1(Integer studentId1){
        this.studentId1 = studentId1;
    }
    /** 互评人id二;外键，连接user表id */
    public Integer getStudentId2(){
        return this.studentId2;
    }
    /** 互评人id二;外键，连接user表id */
    public void setStudentId2(Integer studentId2){
        this.studentId2 = studentId2;
    }
    /** 互评人id三;外键，连接user表id */
    public Integer getStudentId3(){
        return this.studentId3;
    }
    /** 互评人id三;外键，连接user表id */
    public void setStudentId3(Integer studentId3){
        this.studentId3 = studentId3;
    }
    /** 互评人id四;外键，连接user表id */
    public Integer getStudentId4(){
        return this.studentId4;
    }
    /** 互评人id四;外键，连接user表id */
    public void setStudentId4(Integer studentId4){
        this.studentId4 = studentId4;
    }
    /** 互评人id五;外键，连接user表id */
    public Integer getStudentId5(){
        return this.studentId5;
    }
    /** 互评人id五;外键，连接user表id */
    public void setStudentId5(Integer studentId5){
        this.studentId5 = studentId5;
    }
    /** 互评成绩一 */
    public Integer getMutualScore1(){
        return this.mutualScore1;
    }
    /** 互评成绩一 */
    public void setMutualScore1(Integer mutualScore1){
        this.mutualScore1 = mutualScore1;
    }
    /** 互评成绩二 */
    public Integer getMutualScore2(){
        return this.mutualScore2;
    }
    /** 互评成绩二 */
    public void setMutualScore2(Integer mutualScore2){
        this.mutualScore2 = mutualScore2;
    }
    /** 互评成绩三 */
    public Integer getMutualScore3(){
        return this.mutualScore3;
    }
    /** 互评成绩三 */
    public void setMutualScore3(Integer mutualScore3){
        this.mutualScore3 = mutualScore3;
    }
    /** 互评成绩四 */
    public Integer getMutualScore4(){
        return this.mutualScore4;
    }
    /** 互评成绩四 */
    public void setMutualScore4(Integer mutualScore4){
        this.mutualScore4 = mutualScore4;
    }
    /** 互评成绩五 */
    public Integer getMutualScore5(){
        return this.mutualScore5;
    }
    /** 互评成绩五 */
    public void setMutualScore5(Integer mutualScore5){
        this.mutualScore5 = mutualScore5;
    }
}