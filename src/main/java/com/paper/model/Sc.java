package com.paper.model;

import java.io.Serializable;

public class Sc implements Serializable {
    /**
    * SCID
    */
    private String scId;

    /**
    * 课程ID
    */
    private String courseId;

    /**
    * 学号
    */
    private String studentId;

    /**
    * 成绩
    */
    private Integer score;

    private static final long serialVersionUID = 1L;

    public String getScId() {
        return scId;
    }

    public void setScId(String scId) {
        this.scId = scId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", scId=").append(scId);
        sb.append(", courseId=").append(courseId);
        sb.append(", studentId=").append(studentId);
        sb.append(", score=").append(score);
        sb.append("]");
        return sb.toString();
    }
}