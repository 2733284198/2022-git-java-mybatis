package com.imooc.mybatis.mapper;

import com.imooc.mybatis.model.User;
import com.imooc.mybatis.model.UserShortCut;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Select("select username from imooc_user where id = #{id} ")
    String selectUsernameById(Integer id);

    Integer selectUserAgeById(int i);

//    Integer selectUsernameById(Integer id);
    User selectUserByAgeAndScore(User user);

    User selectUserByAgeAndScore2(User user);

    @Results({
            @Result(property = "id", column = "id", id = true),
            @Result(property = "username", column = "username"),
            @Result(property = "age", column = "age"),
            @Result(property = "score", column = "score")
    })
    @Select("SELECT * FROM imooc_user WHERE id = #{id}")
    User selectUserById(Integer id);

    UserShortCut selectUserShortcutById(Integer id);

}


