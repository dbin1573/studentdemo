package com.zhanghongbin.studentdemo.service;

import com.zhanghongbin.studentdemo.entity.Student;
import java.util.List;

/**
 * @Author dbin
 * @Date 2020/1/26
 **/

public interface StudentService {

    //查询学生所有信息
    public List<Student> findAll();

    //修改
    public void updates(List<Student> list);

    //删除
    public void deletes(String ids);


}
