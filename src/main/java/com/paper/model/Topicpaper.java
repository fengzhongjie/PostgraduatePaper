package com.paper.model;

import java.io.Serializable;

public class Topicpaper implements Serializable {
    /**
    * TopicPaperID
    */
    private String topicpaperId;

    /**
    * StuTopicID
    */
    private String stutopicId;

    /**
    * 论文ID
    */
    private String paperId;

    /**
    * 相关程度(0-1 之 间的数值 )
    */
    private Double relevancy;

    private static final long serialVersionUID = 1L;

    public String getTopicpaperId() {
        return topicpaperId;
    }

    public void setTopicpaperId(String topicpaperId) {
        this.topicpaperId = topicpaperId;
    }

    public String getStutopicId() {
        return stutopicId;
    }

    public void setStutopicId(String stutopicId) {
        this.stutopicId = stutopicId;
    }

    public String getPaperId() {
        return paperId;
    }

    public void setPaperId(String paperId) {
        this.paperId = paperId;
    }

    public Double getRelevancy() {
        return relevancy;
    }

    public void setRelevancy(Double relevancy) {
        this.relevancy = relevancy;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", topicpaperId=").append(topicpaperId);
        sb.append(", stutopicId=").append(stutopicId);
        sb.append(", paperId=").append(paperId);
        sb.append(", relevancy=").append(relevancy);
        sb.append("]");
        return sb.toString();
    }
}