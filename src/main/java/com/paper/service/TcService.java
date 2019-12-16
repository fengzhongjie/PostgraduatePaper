package com.paper.service;

import java.util.List;
import com.paper.model.TcExample;
import com.paper.model.Tc;
public interface TcService{


    long countByExample(TcExample example);

    int deleteByExample(TcExample example);

    int deleteByPrimaryKey(String tcId);

    int insert(Tc record);

    int insertSelective(Tc record);

    List<Tc> selectByExample(TcExample example);

    Tc selectByPrimaryKey(String tcId);

    int updateByExampleSelective(Tc record,TcExample example);

    int updateByExample(Tc record,TcExample example);

    int updateByPrimaryKeySelective(Tc record);

    int updateByPrimaryKey(Tc record);

    int updateBatch(List<Tc> list);

    int batchInsert(List<Tc> list);

}
