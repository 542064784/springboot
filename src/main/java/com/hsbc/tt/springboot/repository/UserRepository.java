package com.hsbc.tt.springboot.repository;

import com.hsbc.tt.springboot.pojo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 *  user jpaRepository interface
 * @author Damon Chen
 * @date 2018/8/19
 */
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    /**
     *  find user by username
     * @param username  login user's username
     * @return   user
     */
    User findByUsername(String username);
}
