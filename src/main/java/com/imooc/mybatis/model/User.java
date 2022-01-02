package com.imooc.mybatis.model;

public class User {

    private long id;
    private String username;
    private Integer age;
    private Integer score;


    // 省略了 getter 和 setter 方法，请务必通过 IDE 生成，否则 MyBatis 无法自动映射

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}


