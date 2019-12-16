package com.paper.model;

import java.io.Serializable;

public class User implements Serializable {
    /**
    * 用户ID
    */
    private String userId;

    /**
    * 用户密码
    */
    private String password;

    /**
    * 用户类型，1代表管理员，2代表教师，3代表学生
    */
    private Integer role;

    private static final long serialVersionUID = 1L;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", password=").append(password);
        sb.append(", role=").append(role);
        sb.append("]");
        return sb.toString();
    }
}