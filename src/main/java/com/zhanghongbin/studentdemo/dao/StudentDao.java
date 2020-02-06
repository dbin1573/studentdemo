package com.zhanghongbin.studentdemo.dao;

import com.zhanghongbin.studentdemo.entity.Student;
import org.hibernate.sql.Update;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

/**
 * @Author dbin
 * @Date 2020/1/19
 **/

public interface StudentDao extends JpaRepository<Student, Long> {

//    @Modifying
//    @Query("update Student stu set stu.name ")
//    void update(Student student);
}
