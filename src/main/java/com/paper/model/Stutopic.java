package com.paper.model;

import java.io.Serializable;
import java.util.Date;

public class Stutopic implements Serializable {
    /**
    * StuTopicID
    */
    private String stutopicId;

    /**
    * 学号
    */
    private String studentId;

    /**
    * 主题ID
    */
    private String topicId;

    /**
    * 选题时间
    */
    private Date selectTime;

    /**
    * 是否已经上传论文（0表示未上传，1表示已上传）
    */
    private String flag;

    private static final long serialVersionUID = 1L;

    public String getStutopicId() {
        return stutopicId;
    }

    public void setStutopicId(String stutopicId) {
        this.stutopicId = stutopicId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    public Date getSelectTime() {
        return selectTime;
    }

    public void setSelectTime(Date selectTime) {
        this.selectTime = selectTime;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stutopicId=").append(stutopicId);
        sb.append(", studentId=").append(studentId);
        sb.append(", topicId=").append(topicId);
        sb.append(", selectTime=").append(selectTime);
        sb.append(", flag=").append(flag);
        sb.append("]");
        return sb.toString();
    }
}