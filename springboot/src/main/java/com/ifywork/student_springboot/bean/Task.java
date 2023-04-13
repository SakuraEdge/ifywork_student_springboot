package com.ifywork.student_springboot.bean;

import java.io.Serializable;
import java.util.Date;


public class Task implements Serializable{
    /** 创建人 */
    private String CREATED_BY ;

    private String T_SUBMIT_TIME;

    private String T_TIME_OTHER;
    /** 创建时间 */
    private String CREATED_TIME ;
    /** 更新人 */
    private String UPDATED_BY ;
    /** 更新时间 */
    private String UPDATED_TIME ;
    /** 主键 */
    private Integer id ;
    /** 任务发布人id;外键，连接用户表user的ID主键 */
    private Integer T_TEACHER_ID ;
    /** 任务执行人id;外键，连接用户表user的ID主键 */
    private Integer T_STUDENT_ID ;
    /** 任务班级;外键，连接班级表class的ID主键 */
    private Integer T_COURSE_ID ;
    /** 任务名称 */
    private String T_NAME ;
    /** 任务简介 */
    private String T_INTRODUCE ;
    /** 任务附件文件夹地址;任务上传在服务器的附件文件夹地址 */
    private String T_ANNEX_ADDRESS ;
    /** 任务作业上传地址;任务执行者上传作业后保持在服务器的文件地址 */
    private String T_WORK_ADDRESS ;
    /** 任务完成状态 */
    private String T_ACTIVE ;
    /** 打分类别;举例说明："110"
     第一个数字1表示需要教师评价，第二个数字表示需要学生自评，第三个数字0表示不需要学生互评
     也就是第一个数字代表是否需要教师评价，第二个数字代表是否需要学生自评，第三个数字代表是否需要学生互评 */
    private String T_SCORE_TYPE ;
    /** 教师打分 */
    private Integer T_TEACHER_SCORE ;
    /** 自评打分 */
    private Integer T_SELF_SCORE ;

    private String DELETED;

    private String T_RESUBMIT;

    private String T_TYPE;

    private String T_CODE;


    public String getT_CODE() {
        return T_CODE;
    }

    public void setT_CODE(String t_CODE) {
        T_CODE = t_CODE;
    }

    public String getT_TYPE() {
        return T_TYPE;
    }

    public void setT_TYPE(String t_TYPE) {
        T_TYPE = t_TYPE;
    }

    public String getT_RESUBMIT() {
        return T_RESUBMIT;
    }

    public void setT_RESUBMIT(String t_RESUBMIT) {
        T_RESUBMIT = t_RESUBMIT;
    }

    public void setT_STUDENT_ID(Integer t_STUDENT_ID) {
        T_STUDENT_ID = t_STUDENT_ID;
    }

    public String getDELETED() {
        return DELETED;
    }

    public void setDELETED(String DELETED) {
        this.DELETED = DELETED;
    }

    /** 创建人 */
    public String getCREATED_BY(){
        return this.CREATED_BY;
    }
    /** 创建人 */
    public void setCREATED_BY(String CREATED_BY){
        this.CREATED_BY = CREATED_BY;
    }
    /** 创建时间 */
    public String getCREATED_TIME(){
        return this.CREATED_TIME;
    }
    /** 创建时间 */
    public void setCREATED_TIME(String CREATED_TIME){
        this.CREATED_TIME = CREATED_TIME;
    }
    /** 更新人 */
    public String getUPDATED_BY(){
        return this.UPDATED_BY;
    }
    /** 更新人 */
    public void setUPDATED_BY(String UPDATED_BY){
        this.UPDATED_BY = UPDATED_BY;
    }

    public String getT_SUBMIT_TIME() {
        return T_SUBMIT_TIME;
    }

    public void setT_SUBMIT_TIME(String t_TIME) {
        T_SUBMIT_TIME = t_TIME;
    }

    public String getT_TIME_OTHER() {
        return T_TIME_OTHER;
    }

    public void setT_TIME_OTHER(String t_TIME_OTHER) {
        T_TIME_OTHER = t_TIME_OTHER;
    }

    /** 更新时间 */

    public String getUPDATED_TIME(){
        return this.UPDATED_TIME;
    }
    /** 更新时间 */
    public void setUPDATED_TIME(String UPDATED_TIME){
        this.UPDATED_TIME = UPDATED_TIME;
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
    public Integer getT_TEACHER_ID(){
        return this.T_TEACHER_ID;
    }
    /** 任务发布人id;外键，连接用户表user的ID主键 */
    public void setT_TEACHER_ID(Integer T_TEACHER_ID){
        this.T_TEACHER_ID = T_TEACHER_ID;
    }
    /** 任务执行人id;外键，连接用户表user的ID主键 */
    public Integer getT_STUDENT_ID(){
        return this.T_STUDENT_ID;
    }
    /** 任务执行人id;外键，连接用户表user的ID主键 */
    public void setTStudentUid(Integer T_STUDENT_ID){
        this.T_STUDENT_ID = T_STUDENT_ID;
    }

    public Integer getT_COURSE_ID() {
        return T_COURSE_ID;
    }

    public void setT_COURSE_ID(Integer t_COURSE_ID) {
        T_COURSE_ID = t_COURSE_ID;
    }

    /** 任务名称 */
    public String getT_NAME(){
        return this.T_NAME;
    }
    /** 任务名称 */
    public void setT_NAME(String T_NAME){
        this.T_NAME = T_NAME;
    }
    /** 任务简介 */
    public String getT_INTRODUCE(){
        return this.T_INTRODUCE;
    }
    /** 任务简介 */
    public void setT_INTRODUCE(String T_INTRODUCE){
        this.T_INTRODUCE = T_INTRODUCE;
    }
    /** 任务附件文件夹地址;任务上传在服务器的附件文件夹地址 */
    public String getT_ANNEX_ADDRESS(){
        return this.T_ANNEX_ADDRESS;
    }
    /** 任务附件文件夹地址;任务上传在服务器的附件文件夹地址 */
    public void setT_ANNEX_ADDRESS(String T_ANNEX_ADDRESS){
        this.T_ANNEX_ADDRESS = T_ANNEX_ADDRESS;
    }
    /** 任务作业上传地址;任务执行者上传作业后保持在服务器的文件地址 */
    public String getT_WORK_ADDRESS(){
        return this.T_WORK_ADDRESS;
    }
    /** 任务作业上传地址;任务执行者上传作业后保持在服务器的文件地址 */
    public void setT_WORK_ADDRESS(String T_WORK_ADDRESS){
        this.T_WORK_ADDRESS = T_WORK_ADDRESS;
    }
    /** 任务完成状态 */
    public String getT_ACTIVE(){
        return this.T_ACTIVE;
    }
    /** 任务完成状态 */
    public void setT_ACTIVE(String T_ACTIVE){
        this.T_ACTIVE = T_ACTIVE;
    }
    /** 打分类别;举例说明："110"
     第一个数字1表示需要教师评价，第二个数字表示需要学生自评，第三个数字0表示不需要学生互评
     也就是第一个数字代表是否需要教师评价，第二个数字代表是否需要学生自评，第三个数字代表是否需要学生互评 */
    public String getT_SCORE_TYPE(){
        return this.T_SCORE_TYPE;
    }
    /** 打分类别;举例说明："110"
     第一个数字1表示需要教师评价，第二个数字表示需要学生自评，第三个数字0表示不需要学生互评
     也就是第一个数字代表是否需要教师评价，第二个数字代表是否需要学生自评，第三个数字代表是否需要学生互评 */
    public void setT_SCORE_TYPE(String T_SCORE_TYPE){
        this.T_SCORE_TYPE = T_SCORE_TYPE;
    }
    /** 教师打分 */
    public Integer getT_TEACHER_SCORE(){
        return this.T_TEACHER_SCORE;
    }
    /** 教师打分 */
    public void setT_TEACHER_SCORE(Integer T_TEACHER_SCORE){
        this.T_TEACHER_SCORE = T_TEACHER_SCORE;
    }
    /** 自评打分 */
    public Integer getT_SELF_SCORE(){
        return this.T_SELF_SCORE;
    }
    /** 自评打分 */
    public void setT_SELF_SCORE(Integer T_SELF_SCORE){
        this.T_SELF_SCORE = T_SELF_SCORE;
    }
}