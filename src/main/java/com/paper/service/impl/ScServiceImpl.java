package com.paper.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.paper.model.Sc;
import java.util.List;
import com.paper.mapper.ScMapper;
import com.paper.model.ScExample;
import com.paper.service.ScService;
@Service
public class ScServiceImpl implements ScService{

    @Resource
    private ScMapper scMapper;

    @Override
    public long countByExample(ScExample example) {
        return scMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(ScExample example) {
        return scMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String scId) {
        return scMapper.deleteByPrimaryKey(scId);
    }

    @Override
    public int insert(Sc record) {
        return scMapper.insert(record);
    }

    @Override
    public int insertSelective(Sc record) {
        return scMapper.insertSelective(record);
    }

    @Override
    public List<Sc> selectByExample(ScExample example) {
        return scMapper.selectByExample(example);
    }

    @Override
    public Sc selectByPrimaryKey(String scId) {
        return scMapper.selectByPrimaryKey(scId);
    }

    @Override
    public int updateByExampleSelective(Sc record,ScExample example) {
        return scMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Sc record,ScExample example) {
        return scMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Sc record) {
        return scMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Sc record) {
        return scMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<Sc> list) {
        return scMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<Sc> list) {
        return scMapper.batchInsert(list);
    }

}
