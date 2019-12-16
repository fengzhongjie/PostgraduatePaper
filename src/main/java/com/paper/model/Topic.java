package com.paper.model;

import java.io.Serializable;
import java.util.Date;

public class Topic implements Serializable {
    /**
    * 主题ID
    */
    private String topicId;

    /**
    * 课程ID
    */
    private String courseId;

    /**
    * 出题教师 ID
    */
    private String teacherId;

    /**
    * 主题名
    */
    private String topic;

    /**
    * 关键词
    */
    private String keyword;

    /**
    * 创建时间
    */
    private Date creationTime;

    /**
    * 已选学生人数（每个主题最多被 5 名学生所选）
    */
    private Integer studentNum;

    private static final long serialVersionUID = 1L;

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
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

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Integer getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(Integer studentNum) {
        this.studentNum = studentNum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", topicId=").append(topicId);
        sb.append(", courseId=").append(courseId);
        sb.append(", teacherId=").append(teacherId);
        sb.append(", topic=").append(topic);
        sb.append(", keyword=").append(keyword);
        sb.append(", creationTime=").append(creationTime);
        sb.append(", studentNum=").append(studentNum);
        sb.append("]");
        return sb.toString();
    }
}