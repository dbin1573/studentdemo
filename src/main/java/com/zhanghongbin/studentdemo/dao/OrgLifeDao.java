package com.zhanghongbin.studentdemo.dao;

import com.zhanghongbin.studentdemo.entity.OrgLife;
import com.zhanghongbin.studentdemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author dbin
 * @Date 2020/2/6
 **/

@Repository
public interface OrgLifeDao extends JpaRepository<OrgLife,Long> {
}
