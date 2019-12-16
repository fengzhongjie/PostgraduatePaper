package com.paper.service;

import java.util.List;
import com.paper.model.Teacher;
import com.paper.model.TeacherExample;
public interface TeacherService{


    long countByExample(TeacherExample example);

    int deleteByExample(TeacherExample example);

    int deleteByPrimaryKey(String teacherId);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    List<Teacher> selectByExample(TeacherExample example);

    Teacher selectByPrimaryKey(String teacherId);

    int updateByExampleSelective(Teacher record,TeacherExample example);

    int updateByExample(Teacher record,TeacherExample example);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);

    int updateBatch(List<Teacher> list);

    int batchInsert(List<Teacher> list);

}
