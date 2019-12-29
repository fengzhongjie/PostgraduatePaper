package com.paper.model;

import java.io.Serializable;

public class Tc implements Serializable {
    /**
    * TCID
    */
    private Integer tcId;

    /**
    * 课程ID
    */
    private String courseId;

    /**
    * 教师ID
    */
    private String teacherId;

    /**
    * 身份（主讲教师或者团队教师）
    */
    private String teaIdentity;

    /**
    * 授课学时
    */
    private Integer teachHour;

    private static final long serialVersionUID = 1L;

    public Integer getTcId() {
        return tcId;
    }

    public void setTcId(Integer tcId) {
        this.tcId = tcId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeaIdentity() {
        return teaIdentity;
    }

    public void setTeaIdentity(String teaIdentity) {
        this.teaIdentity = teaIdentity;
    }

    public Integer getTeachHour() {
        return teachHour;
    }

    public void setTeachHour(Integer teachHour) {
        this.teachHour = teachHour;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tcId=").append(tcId);
        sb.append(", courseId=").append(courseId);
        sb.append(", teacherId=").append(teacherId);
        sb.append(", teaIdentity=").append(teaIdentity);
        sb.append(", teachHour=").append(teachHour);
        sb.append("]");
        return sb.toString();
    }
}