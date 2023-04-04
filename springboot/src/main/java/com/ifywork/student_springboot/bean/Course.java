package com.ifywork.student_springboot.bean;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.io.Serializable;
import java.util.Date;


public class Course implements Serializable{
    /** 创建人 */
    private String CREATED_BY ;
    /** 创建时间 */
    private Date CREATED_TIME ;
    /** 更新人 */
    private String UPDATED_BY ;
    /** 更新时间 */
    private Date UPDATED_TIME;
    /** 主键 */
    private Integer id ;
    /** 课程名称 */
    private String COURSE_NAME ;
    /** 课程简介 */
    private String COURSE_INTRODUCE ;
    /** 上课时间;设置起始周于结束周，使用"-"进行连接，具体时间信息使用"|" 衔接，多个时间段使用 ","进行分割
     例如：
     1-7|2|1-2,9-12|3|3-4
     表示该课程的上课时间为1到7周星期二的1到2节，和9到12周星期三的3到4节 */
    private String COURSE_TIME ;
    /** 课程是否为线上课程 */
    private Integer COURSE_ONLINE ;
    /** 上课地址 */
    private int ADDRESS_ID ;
    /** 主讲老师id;外键，连接user表id */
    private String TEACHER_MAIN_ID ;
    /** 助教老师id;使用","分割 */
    private String TEACHER_ASSIST_ID ;

    private String TERM;

    private String YEAR;

    private String DELETED;

    private String CLASS_MAIN;

    private Date START_TIME;

    private Date END_TIME;

    private int STUDENT_NUM;

    private int COURSE_PERIOD;

    private int IS_OPEN;

    private String COURSE_STATUS;

    private String DATA_SYN;

    private String ONLINE_CODE;

    private String COURSE_CODE;


    /** 创建人 */
    public String getCREATED_BY(){
        return this.CREATED_BY;
    }
    /** 创建人 */
    public void setCREATED_BY(String CREATED_BY){
        this.CREATED_BY = CREATED_BY;
    }
    /** 创建时间 */
    public Date getCREATED_TIME(){
        return this.CREATED_TIME;
    }
    /** 创建时间 */
    public void setCREATED_TIME(Date CREATED_TIME){
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
    /** 更新时间 */
    public Date getUPDATED_TIME(){
        return this.UPDATED_TIME;
    }
    /** 更新时间 */
    public void setUPDATED_TIME(Date UPDATED_TIME){
        this.UPDATED_TIME= UPDATED_TIME;
    }
    /** 主键 */
    public Integer getId(){
        return this.id;
    }
    /** 主键 */
    public void setId(Integer id){
        this.id = id;
    }
    /** 课程名称 */
    public String getCOURSE_NAME(){
        return this.COURSE_NAME;
    }
    /** 课程名称 */
    public void setCOURSE_NAME(String COURSE_NAME){
        this.COURSE_NAME = COURSE_NAME;
    }
    /** 课程简介 */
    public String getCOURSE_INTRODUCE(){
        return this.COURSE_INTRODUCE;
    }
    /** 课程简介 */
    public void setCOURSE_INTRODUCE(String COURSE_INTRODUCE){
        this.COURSE_INTRODUCE = COURSE_INTRODUCE;
    }
    /** 上课时间;设置起始周于结束周，使用"-"进行连接，具体时间信息使用"|" 衔接，多个时间段使用 ","进行分割
     例如：
     1-7|2|1-2,9-12|3|3-4
     表示该课程的上课时间为1到7周星期二的1到2节，和9到12周星期三的3到4节 */
    public String getCOURSE_TIME(){
        return this.COURSE_TIME;
    }
    /** 上课时间;设置起始周于结束周，使用"-"进行连接，具体时间信息使用"|" 衔接，多个时间段使用 ","进行分割
     例如：
     1-7|2|1-2,9-12|3|3-4
     表示该课程的上课时间为1到7周星期二的1到2节，和9到12周星期三的3到4节 */
    public void setCOURSE_TIME(String COURSE_TIME){
        this.COURSE_TIME = COURSE_TIME;
    }
    /** 主讲老师id;外键，连接user表id */
    public String getTEACHER_MAIN_ID(){
        return this.TEACHER_MAIN_ID;
    }
    /** 主讲老师id;外键，连接user表id */
    public void setTEACHER_MAIN_ID(String TEACHER_MAIN_ID){
        this.TEACHER_MAIN_ID = TEACHER_MAIN_ID;
    }
    /** 助教老师id;使用","分割 */
    public String getTEACHER_ASSIST_ID(){
        return this.TEACHER_ASSIST_ID;
    }
    /** 助教老师id;使用","分割 */
    public void setTEACHER_ASSIST_ID(String TEACHER_ASSIST_ID){
        this.TEACHER_ASSIST_ID = TEACHER_ASSIST_ID;
    }

    public String getONLINE_CODE() {
        return ONLINE_CODE;
    }

    public void setONLINE_CODE(String ONLINE_CODE) {
        this.ONLINE_CODE = ONLINE_CODE;
    }

    public Integer getCOURSE_ONLINE() {
        return COURSE_ONLINE;
    }

    public void setCOURSE_ONLINE(Integer COURSE_ONLINE) {
        this.COURSE_ONLINE = COURSE_ONLINE;
    }

    public int getADDRESS_ID() {
        return ADDRESS_ID;
    }

    public void setADDRESS_ID(int ADDRESS_ID) {
        this.ADDRESS_ID = ADDRESS_ID;
    }

    public String getTERM() {
        return TERM;
    }

    public void setTERM(String TERM) {
        this.TERM = TERM;
    }

    public String getYEAR() {
        return YEAR;
    }

    public void setYEAR(String YEAR) {
        this.YEAR = YEAR;
    }

    public String getDELETED() {
        return DELETED;
    }

    public void setDELETED(String DELETED) {
        this.DELETED = DELETED;
    }

    public String getCLASS_MAIN() {
        return CLASS_MAIN;
    }

    public void setCLASS_MAIN(String CLASS_MAIN) {
        this.CLASS_MAIN = CLASS_MAIN;
    }

    public Date getSTART_TIME() {
        return START_TIME;
    }

    public void setSTART_TIME(Date START_TIME) {
        this.START_TIME = START_TIME;
    }

    public Date getEND_TIME() {
        return END_TIME;
    }

    public void setEND_TIME(Date END_TIME) {
        this.END_TIME = END_TIME;
    }

    public int getSTUDENT_NUM() {
        return STUDENT_NUM;
    }

    public void setSTUDENT_NUM(int STUDENT_NUM) {
        this.STUDENT_NUM = STUDENT_NUM;
    }

    public int getCOURSE_PERIOD() {
        return COURSE_PERIOD;
    }

    public void setCOURSE_PERIOD(int COURSE_PERIOD) {
        this.COURSE_PERIOD = COURSE_PERIOD;
    }

    public int getIS_OPEN() {
        return IS_OPEN;
    }

    public void setIS_OPEN(int IS_OPEN) {
        this.IS_OPEN = IS_OPEN;
    }

    public String getCOURSE_STATUS() {
        return COURSE_STATUS;
    }

    public void setCOURSE_STATUS(String COURSE_STATUS) {
        this.COURSE_STATUS = COURSE_STATUS;
    }

    public String getDATA_SYN() {
        return DATA_SYN;
    }

    public void setDATA_SYN(String DATA_SYN) {
        this.DATA_SYN = DATA_SYN;
    }

    public String getCOURSE_CODE() {
        return COURSE_CODE;
    }

    public void setCOURSE_CODE(String COURSE_CODE) {
        this.COURSE_CODE = COURSE_CODE;
    }
}