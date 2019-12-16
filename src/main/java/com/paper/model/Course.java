package com.paper.model;

import java.io.Serializable;

public class Course implements Serializable {
    /**
    * 课程ID
    */
    private String courseId;

    /**
    * 课程名
    */
    private String courseName;

    /**
    * 开设学期
    */
    private String term;

    /**
    * 课时数
    */
    private Integer courseHour;

    private static final long serialVersionUID = 1L;

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public Integer getCourseHour() {
        return courseHour;
    }

    public void setCourseHour(Integer courseHour) {
        this.courseHour = courseHour;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", courseId=").append(courseId);
        sb.append(", courseName=").append(courseName);
        sb.append(", term=").append(term);
        sb.append(", courseHour=").append(courseHour);
        sb.append("]");
        return sb.toString();
    }
}