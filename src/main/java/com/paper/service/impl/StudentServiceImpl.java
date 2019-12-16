package com.paper.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.paper.model.StudentExample;
import com.paper.mapper.StudentMapper;
import com.paper.model.Student;
import com.paper.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService{

    @Resource
    private StudentMapper studentMapper;

    @Override
    public long countByExample(StudentExample example) {
        return studentMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(StudentExample example) {
        return studentMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String studentId) {
        return studentMapper.deleteByPrimaryKey(studentId);
    }

    @Override
    public int insert(Student record) {
        return studentMapper.insert(record);
    }

    @Override
    public int insertSelective(Student record) {
        return studentMapper.insertSelective(record);
    }

    @Override
    public List<Student> selectByExample(StudentExample example) {
        return studentMapper.selectByExample(example);
    }

    @Override
    public Student selectByPrimaryKey(String studentId) {
        return studentMapper.selectByPrimaryKey(studentId);
    }

    @Override
    public int updateByExampleSelective(Student record,StudentExample example) {
        return studentMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Student record,StudentExample example) {
        return studentMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Student record) {
        return studentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Student record) {
        return studentMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<Student> list) {
        return studentMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<Student> list) {
        return studentMapper.batchInsert(list);
    }

}
