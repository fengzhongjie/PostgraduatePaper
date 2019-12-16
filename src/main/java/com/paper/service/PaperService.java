package com.paper.service;

import com.paper.model.PaperExample;
import java.util.List;
import com.paper.model.Paper;
public interface PaperService{


    long countByExample(PaperExample example);

    int deleteByExample(PaperExample example);

    int deleteByPrimaryKey(String paperId);

    int insert(Paper record);

    int insertSelective(Paper record);

    List<Paper> selectByExample(PaperExample example);

    Paper selectByPrimaryKey(String paperId);

    int updateByExampleSelective(Paper record,PaperExample example);

    int updateByExample(Paper record,PaperExample example);

    int updateByPrimaryKeySelective(Paper record);

    int updateByPrimaryKey(Paper record);

    int updateBatch(List<Paper> list);

    int batchInsert(List<Paper> list);

}
