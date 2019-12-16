package com.paper.model;

import java.io.Serializable;

public class Student implements Serializable {
    /**
    * 学号
    */
    private String studentId;

    /**
    * 姓名
    */
    private String name;

    /**
    * 性别
    */
    private String sex;

    /**
    * 专业
    */
    private String major;

    /**
    * 班级
    */
    private String className;

    private static final long serialVersionUID = 1L;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", studentId=").append(studentId);
        sb.append(", name=").append(name);
        sb.append(", sex=").append(sex);
        sb.append(", major=").append(major);
        sb.append(", className=").append(className);
        sb.append("]");
        return sb.toString();
    }
}