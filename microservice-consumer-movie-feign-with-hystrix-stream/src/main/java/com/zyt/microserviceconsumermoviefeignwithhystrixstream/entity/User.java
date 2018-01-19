package com.zyt.microserviceconsumermoviefeignwithhystrixstream.entity;

/**
 * @author zhayangtao
 * @version 1.0
 * @since 2018/1/19
 */
public class User {
    private Long id;
    private String username;
    private Integer age;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}