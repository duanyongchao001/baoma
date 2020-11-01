package com.xunhe.tech_man_sys.repository;

import com.xunhe.tech_man_sys.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

// 继承JpaRepository来完成对数据库的操作
public interface UserRepository extends JpaRepository<User, Integer> {

}
