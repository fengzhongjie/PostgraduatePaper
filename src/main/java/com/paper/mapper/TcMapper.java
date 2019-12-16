package com.paper.mapper;

import com.paper.model.Tc;
import com.paper.model.TcExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TcMapper {
    long countByExample(TcExample example);

    int deleteByExample(TcExample example);

    int deleteByPrimaryKey(String tcId);

    int insert(Tc record);

    int insertSelective(Tc record);

    List<Tc> selectByExample(TcExample example);

    Tc selectByPrimaryKey(String tcId);

    int updateByExampleSelective(@Param("record") Tc record, @Param("example") TcExample example);

    int updateByExample(@Param("record") Tc record, @Param("example") TcExample example);

    int updateByPrimaryKeySelective(Tc record);

    int updateByPrimaryKey(Tc record);

    int updateBatch(List<Tc> list);

    int batchInsert(@Param("list") List<Tc> list);
}