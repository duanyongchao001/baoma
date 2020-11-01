package com.xunhe.tech_man_sys.entity;

import javax.persistence.*;

//使用JPA注解配置映射关系
//告诉JPA这是一个实体类（和数据表映射的类）
@Entity
@Table()
public class User {
    private Integer id;
    private String name;
    private String email;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //自增主键
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}