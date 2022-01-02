package com.imooc.mybatis.mapper;

import com.imooc.mybatis.model.User;
import com.imooc.mybatis.model.UserShortCut;
import org.apache.ibatis.annotations.*;

@Mapper // todo
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

    /* 插入 :insert */

    /*@Insert("INSERT INTO imooc_user(username,age,score) VALUES (#{username},#{age},#{score})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertUser2(User user);*/

    int insertUser(User user);

//    @Update("UPDATE imooc_user SET age = #{age} WHERE id = #{id}")
//    int updateUserAgeById(@Param("age") Integer age, @Param("id") Integer id);

    /* 更新用户 */
    int updateUserAgeById(@Param("age") Integer age, @Param("id") Integer id);

    int updateUsernameAndScoreById(@Param("username") String username, @Param("score") Integer score, @Param("id") Integer id);
}


