package com.cn.lhb.small_tigers.mapper;

import com.cn.lhb.small_tigers.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface GlobalMapper {

    @Select("select * from user where username=#{username}")
    public User queryUser(String username);



}
