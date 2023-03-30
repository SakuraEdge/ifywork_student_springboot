package com.ifywork.student_springboot.bean;

import java.io.Serializable;
import java.util.Date;

public class MyClass implements Serializable{
    /** 创建人 */
    private String CREATED_BY ;
    /** 创建时间 */
    private Date CREATED_TIME ;
    /** 更新人 */
    private String UPDATED_BY ;
    /** 更新时间 */
    private Date UPDATED_TIME ;
    /** 主键 */
    private Integer id ;
    /** 班级名称 */
    private String CLASS_NAME ;
    /** 班级教师id;外键，连接user表的id */
    private Integer CLASS_TEACHER_ID ;
    /** 班级信息 */
    private String CLASS_INTRODUCE ;

    private String CLASS_CODE;

    private  int M_ID;

    private  int O_ID;

    private  int ADMISSION_TIME;

    private  String EDUCATIONAL_SYSTEM;

    private  String FLAG;

    private String DELETED;

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
    /** 班级名称 */
    public String getCLASS_NAME(){
        return this.CLASS_NAME;
    }
    /** 班级名称 */
    public void setCLASS_NAME(String CLASS_NAME){
        this.CLASS_NAME = CLASS_NAME;
    }
    /** 班级教师id;外键，连接user表的id */
    public Integer getCLASS_TEACHER_ID(){
        return this.CLASS_TEACHER_ID;
    }
    /** 班级教师id;外键，连接user表的id */
    public void setCLASS_TEACHER_ID(Integer CLASS_TEACHER_ID){
        this.CLASS_TEACHER_ID = CLASS_TEACHER_ID;
    }
    /** 班级信息 */
    public String getCLASS_INTRODUCE(){
        return this.CLASS_INTRODUCE;
    }
    /** 班级信息 */
    public void setCLASS_INTRODUCE(String CLASS_INTRODUCE){
        this.CLASS_INTRODUCE = CLASS_INTRODUCE;
    }

    public String getCLASS_CODE() {
        return CLASS_CODE;
    }

    public void setCLASS_CODE(String CLASS_CODE) {
        this.CLASS_CODE = CLASS_CODE;
    }

    public int getM_ID() {
        return M_ID;
    }

    public void setM_ID(int m_ID) {
        M_ID = m_ID;
    }

    public int getO_ID() {
        return O_ID;
    }

    public void setO_ID(int o_ID) {
        O_ID = o_ID;
    }

    public int getADMISSION_TIME() {
        return ADMISSION_TIME;
    }

    public void setADMISSION_TIME(int ADMISSION_TIME) {
        this.ADMISSION_TIME = ADMISSION_TIME;
    }

    public String getEDUCATIONAL_SYSTEM() {
        return EDUCATIONAL_SYSTEM;
    }

    public void setEDUCATIONAL_SYSTEM(String EDUCATIONAL_SYSTEM) {
        this.EDUCATIONAL_SYSTEM = EDUCATIONAL_SYSTEM;
    }

    public String getFLAG() {
        return FLAG;
    }

    public void setFLAG(String FLAG) {
        this.FLAG = FLAG;
    }

    public String getDELETED() {
        return DELETED;
    }

    public void setDELETED(String DELETED) {
        this.DELETED = DELETED;
    }
}