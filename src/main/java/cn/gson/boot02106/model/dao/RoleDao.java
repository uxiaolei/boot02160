package cn.gson.boot02106.model.dao;

import cn.gson.boot02106.model.pojos.Role;

public interface RoleDao {
    int deleteByPrimaryKey(Integer rId);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer rId);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}