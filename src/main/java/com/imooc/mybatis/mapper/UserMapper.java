package com.imooc.mybatis.mapper;

import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    @Select("select username from imooc_user where id = #{id} ")
    String selectUsernameById(Integer id);

    Integer selectUserAgeById(int i);

//    Integer selectUsernameById(Integer id);
}


