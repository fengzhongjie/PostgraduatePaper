package com.paper.model;

import java.io.Serializable;

public class Teacher implements Serializable {
    /**
    * 教师ID
    */
    private String teacherId;

    /**
    * 姓名
    */
    private String name;

    /**
    * 性别
    */
    private String sex;

    /**
    * 教师职称
    */
    private String protitle;

    /**
    * 手机号
    */
    private String phone;

    private static final long serialVersionUID = 1L;

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
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

    public String getProtitle() {
        return protitle;
    }

    public void setProtitle(String protitle) {
        this.protitle = protitle;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", teacherId=").append(teacherId);
        sb.append(", name=").append(name);
        sb.append(", sex=").append(sex);
        sb.append(", protitle=").append(protitle);
        sb.append(", phone=").append(phone);
        sb.append("]");
        return sb.toString();
    }
}