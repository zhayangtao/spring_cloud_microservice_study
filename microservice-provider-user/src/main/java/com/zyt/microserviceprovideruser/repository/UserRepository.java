package com.zyt.microserviceprovideruser.repository;

import com.zyt.microserviceprovideruser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author zhayangtao
 * @version 1.0
 * @since 2018/1/18
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
