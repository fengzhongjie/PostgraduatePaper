package com.paper.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.paper.model.StutopicExample;
import com.paper.model.Stutopic;
import com.paper.mapper.StutopicMapper;
import com.paper.service.StutopicService;
@Service
public class StutopicServiceImpl implements StutopicService{

    @Resource
    private StutopicMapper stutopicMapper;

    @Override
    public long countByExample(StutopicExample example) {
        return stutopicMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(StutopicExample example) {
        return stutopicMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String stutopicId) {
        return stutopicMapper.deleteByPrimaryKey(stutopicId);
    }

    @Override
    public int insert(Stutopic record) {
        return stutopicMapper.insert(record);
    }

    @Override
    public int insertSelective(Stutopic record) {
        return stutopicMapper.insertSelective(record);
    }

    @Override
    public List<Stutopic> selectByExample(StutopicExample example) {
        return stutopicMapper.selectByExample(example);
    }

    @Override
    public Stutopic selectByPrimaryKey(String stutopicId) {
        return stutopicMapper.selectByPrimaryKey(stutopicId);
    }

    @Override
    public int updateByExampleSelective(Stutopic record,StutopicExample example) {
        return stutopicMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Stutopic record,StutopicExample example) {
        return stutopicMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Stutopic record) {
        return stutopicMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Stutopic record) {
        return stutopicMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<Stutopic> list) {
        return stutopicMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<Stutopic> list) {
        return stutopicMapper.batchInsert(list);
    }

}
