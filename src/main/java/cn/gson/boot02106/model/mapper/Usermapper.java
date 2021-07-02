package cn.gson.boot02106.model.mapper;

import cn.gson.boot02106.model.pojos.User;

public interface Usermapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}