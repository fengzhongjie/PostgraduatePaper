package com.paper.mapper;

import com.paper.model.Topicpaper;
import com.paper.model.TopicpaperExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TopicpaperMapper {
    long countByExample(TopicpaperExample example);

    int deleteByExample(TopicpaperExample example);

    int deleteByPrimaryKey(String topicpaperId);

    int insert(Topicpaper record);

    int insertSelective(Topicpaper record);

    List<Topicpaper> selectByExample(TopicpaperExample example);

    Topicpaper selectByPrimaryKey(String topicpaperId);

    int updateByExampleSelective(@Param("record") Topicpaper record, @Param("example") TopicpaperExample example);

    int updateByExample(@Param("record") Topicpaper record, @Param("example") TopicpaperExample example);

    int updateByPrimaryKeySelective(Topicpaper record);

    int updateByPrimaryKey(Topicpaper record);

    int updateBatch(List<Topicpaper> list);

    int batchInsert(@Param("list") List<Topicpaper> list);
}