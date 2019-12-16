package com.paper.service;

import java.util.List;
import com.paper.model.StudentExample;
import com.paper.model.Student;
public interface StudentService{


    long countByExample(StudentExample example);

    int deleteByExample(StudentExample example);

    int deleteByPrimaryKey(String studentId);

    int insert(Student record);

    int insertSelective(Student record);

    List<Student> selectByExample(StudentExample example);

    Student selectByPrimaryKey(String studentId);

    int updateByExampleSelective(Student record,StudentExample example);

    int updateByExample(Student record,StudentExample example);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    int updateBatch(List<Student> list);

    int batchInsert(List<Student> list);

}
