package com.ifywork.student_springboot.bean;

import java.io.Serializable;
import java.util.Date;


public class Task implements Serializable{
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
    /** 任务发布人id;外键，连接用户表user的ID主键 */
    private Integer tTeacherUid ;
    /** 任务执行人id;外键，连接用户表user的ID主键 */
    private Integer tStudentUid ;
    /** 任务班级;外键，连接班级表class的ID主键 */
    private Integer tClassid ;
    /** 任务名称 */
    private String tName ;
    /** 任务简介 */
    private String tIntroduce ;
    /** 任务附件文件夹地址;任务上传在服务器的附件文件夹地址 */
    private String tAnnexAddress ;
    /** 任务作业上传地址;任务执行者上传作业后保持在服务器的文件地址 */
    private String tWorkAddress ;
    /** 任务完成状态 */
    private String tActive ;
    /** 打分类别;举例说明："110"
     第一个数字1表示需要教师评价，第二个数字表示需要学生自评，第三个数字0表示不需要学生互评
     也就是第一个数字代表是否需要教师评价，第二个数字代表是否需要学生自评，第三个数字代表是否需要学生互评 */
    private String tScoreType ;
    /** 教师打分 */
    private Integer tTeacherScore ;
    /** 自评打分 */
    private Integer tSelfScore ;

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
    /** 任务发布人id;外键，连接用户表user的ID主键 */
    public Integer getTTeacherUid(){
        return this.tTeacherUid;
    }
    /** 任务发布人id;外键，连接用户表user的ID主键 */
    public void setTTeacherUid(Integer tTeacherUid){
        this.tTeacherUid = tTeacherUid;
    }
    /** 任务执行人id;外键，连接用户表user的ID主键 */
    public Integer getTStudentUid(){
        return this.tStudentUid;
    }
    /** 任务执行人id;外键，连接用户表user的ID主键 */
    public void setTStudentUid(Integer tStudentUid){
        this.tStudentUid = tStudentUid;
    }
    /** 任务班级;外键，连接班级表class的ID主键 */
    public Integer getTClassid(){
        return this.tClassid;
    }
    /** 任务班级;外键，连接班级表class的ID主键 */
    public void setTClassid(Integer tClassid){
        this.tClassid = tClassid;
    }
    /** 任务名称 */
    public String getTName(){
        return this.tName;
    }
    /** 任务名称 */
    public void setTName(String tName){
        this.tName = tName;
    }
    /** 任务简介 */
    public String getTIntroduce(){
        return this.tIntroduce;
    }
    /** 任务简介 */
    public void setTIntroduce(String tIntroduce){
        this.tIntroduce = tIntroduce;
    }
    /** 任务附件文件夹地址;任务上传在服务器的附件文件夹地址 */
    public String getTAnnexAddress(){
        return this.tAnnexAddress;
    }
    /** 任务附件文件夹地址;任务上传在服务器的附件文件夹地址 */
    public void setTAnnexAddress(String tAnnexAddress){
        this.tAnnexAddress = tAnnexAddress;
    }
    /** 任务作业上传地址;任务执行者上传作业后保持在服务器的文件地址 */
    public String getTWorkAddress(){
        return this.tWorkAddress;
    }
    /** 任务作业上传地址;任务执行者上传作业后保持在服务器的文件地址 */
    public void setTWorkAddress(String tWorkAddress){
        this.tWorkAddress = tWorkAddress;
    }
    /** 任务完成状态 */
    public String getTActive(){
        return this.tActive;
    }
    /** 任务完成状态 */
    public void setTActive(String tActive){
        this.tActive = tActive;
    }
    /** 打分类别;举例说明："110"
     第一个数字1表示需要教师评价，第二个数字表示需要学生自评，第三个数字0表示不需要学生互评
     也就是第一个数字代表是否需要教师评价，第二个数字代表是否需要学生自评，第三个数字代表是否需要学生互评 */
    public String getTScoreType(){
        return this.tScoreType;
    }
    /** 打分类别;举例说明："110"
     第一个数字1表示需要教师评价，第二个数字表示需要学生自评，第三个数字0表示不需要学生互评
     也就是第一个数字代表是否需要教师评价，第二个数字代表是否需要学生自评，第三个数字代表是否需要学生互评 */
    public void setTScoreType(String tScoreType){
        this.tScoreType = tScoreType;
    }
    /** 教师打分 */
    public Integer getTTeacherScore(){
        return this.tTeacherScore;
    }
    /** 教师打分 */
    public void setTTeacherScore(Integer tTeacherScore){
        this.tTeacherScore = tTeacherScore;
    }
    /** 自评打分 */
    public Integer getTSelfScore(){
        return this.tSelfScore;
    }
    /** 自评打分 */
    public void setTSelfScore(Integer tSelfScore){
        this.tSelfScore = tSelfScore;
    }
}