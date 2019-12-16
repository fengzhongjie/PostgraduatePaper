package com.paper.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.paper.model.TcExample;
import com.paper.mapper.TcMapper;
import com.paper.model.Tc;
import com.paper.service.TcService;
@Service
public class TcServiceImpl implements TcService{

    @Resource
    private TcMapper tcMapper;

    @Override
    public long countByExample(TcExample example) {
        return tcMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TcExample example) {
        return tcMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String tcId) {
        return tcMapper.deleteByPrimaryKey(tcId);
    }

    @Override
    public int insert(Tc record) {
        return tcMapper.insert(record);
    }

    @Override
    public int insertSelective(Tc record) {
        return tcMapper.insertSelective(record);
    }

    @Override
    public List<Tc> selectByExample(TcExample example) {
        return tcMapper.selectByExample(example);
    }

    @Override
    public Tc selectByPrimaryKey(String tcId) {
        return tcMapper.selectByPrimaryKey(tcId);
    }

    @Override
    public int updateByExampleSelective(Tc record,TcExample example) {
        return tcMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Tc record,TcExample example) {
        return tcMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Tc record) {
        return tcMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Tc record) {
        return tcMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<Tc> list) {
        return tcMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<Tc> list) {
        return tcMapper.batchInsert(list);
    }

}
