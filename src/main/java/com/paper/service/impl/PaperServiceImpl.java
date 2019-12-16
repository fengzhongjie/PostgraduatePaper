package com.paper.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.paper.model.PaperExample;
import com.paper.mapper.PaperMapper;
import java.util.List;
import com.paper.model.Paper;
import com.paper.service.PaperService;
@Service
public class PaperServiceImpl implements PaperService{

    @Resource
    private PaperMapper paperMapper;

    @Override
    public long countByExample(PaperExample example) {
        return paperMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(PaperExample example) {
        return paperMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String paperId) {
        return paperMapper.deleteByPrimaryKey(paperId);
    }

    @Override
    public int insert(Paper record) {
        return paperMapper.insert(record);
    }

    @Override
    public int insertSelective(Paper record) {
        return paperMapper.insertSelective(record);
    }

    @Override
    public List<Paper> selectByExample(PaperExample example) {
        return paperMapper.selectByExample(example);
    }

    @Override
    public Paper selectByPrimaryKey(String paperId) {
        return paperMapper.selectByPrimaryKey(paperId);
    }

    @Override
    public int updateByExampleSelective(Paper record,PaperExample example) {
        return paperMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Paper record,PaperExample example) {
        return paperMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Paper record) {
        return paperMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Paper record) {
        return paperMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<Paper> list) {
        return paperMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<Paper> list) {
        return paperMapper.batchInsert(list);
    }

}
