package com.hsbc.tt.springboot.repository;

import com.hsbc.tt.springboot.pojo.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 * user's role jpaRepository interface
 *
 * @author Damon Chen
 * @date 2018/08/19
 */
@Repository
public interface RoleRepository extends JpaRepository<Role,Integer> {
}
