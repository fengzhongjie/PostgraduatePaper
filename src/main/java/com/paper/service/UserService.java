package com.paper.service;

import java.util.List;
import com.paper.model.UserExample;
import com.paper.model.User;
public interface UserService{

    User checkLogin(String username,String password);

    void regist(User user);

    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(String userId);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(String userId);

    int updateByExampleSelective(User record,UserExample example);

    int updateByExample(User record,UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int updateBatch(List<User> list);

    int batchInsert(List<User> list);

}
