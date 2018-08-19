package com.hsbc.tt.springboot.Repository;

import com.hsbc.tt.springboot.pojo.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Cteate by IntelliJ IDEA
 * Author:  Damon Chen
 * Date:  2018/8/19 10:50
 */
@Repository
public interface RoleRepository extends JpaRepository<Role,Integer> {
}
