package com.fly.mapping;

import com.fly.model.Power;

public interface PowerMapper {
    int deleteByPrimaryKey(String powerId);

    int insert(Power record);

    int insertSelective(Power record);

    Power selectByPrimaryKey(String powerId);

    int updateByPrimaryKeySelective(Power record);

    int updateByPrimaryKey(Power record);
}