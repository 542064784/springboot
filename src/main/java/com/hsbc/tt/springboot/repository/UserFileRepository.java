package com.hsbc.tt.springboot.repository;

import com.hsbc.tt.springboot.pojo.entity.User;
import com.hsbc.tt.springboot.pojo.entity.UserFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 *   user upload file jpaRepository interface
 * @author Damon Chen
 * @date 2018/8/19
 */
@Repository
public interface UserFileRepository extends JpaRepository<UserFile,Long> {

    User findByUsername(String username);

}
