package com.paper.service;

import com.paper.model.Sc;
import java.util.List;
import com.paper.model.ScExample;
public interface ScService{


    long countByExample(ScExample example);

    int deleteByExample(ScExample example);

    int deleteByPrimaryKey(String scId);

    int insert(Sc record);

    int insertSelective(Sc record);

    List<Sc> selectByExample(ScExample example);

    Sc selectByPrimaryKey(String scId);

    int updateByExampleSelective(Sc record,ScExample example);

    int updateByExample(Sc record,ScExample example);

    int updateByPrimaryKeySelective(Sc record);

    int updateByPrimaryKey(Sc record);

    int updateBatch(List<Sc> list);

    int batchInsert(List<Sc> list);

}
