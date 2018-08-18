package com.hsbc.tt.springboot.Repository;

import com.hsbc.tt.springboot.pojo.entity.UserFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Cteate by IntelliJ IDEA
 * Author:  Damon Chen
 * Date:  2018/8/18 20:11
 */
@Repository
public interface UserFileRepository extends JpaRepository<UserFile,Long> {
}
