package com.zhanghongbin.studentdemo.service;

import com.zhanghongbin.studentdemo.dao.StudentDao;
import com.zhanghongbin.studentdemo.entity.Student;
import com.zhanghongbin.studentdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author dbin
 * @Date 2020/1/19
 **/

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    public List<Student> findAll() {
        Pageable pageable = Pageable.unpaged();

        return studentDao.findAll(); //未分页
    }

    @Override
    public void updates(List<Student> list) {
        //todo 批量更新
    }

    public void save(Student student){
        studentDao.save(student);
    }

    public void deletes(String ids) {
        String idt[] = ids.split(",");

        List<Student> list = new ArrayList<>();
        for (String id : idt) {
            Student student=new Student();
            student.setId(id);
            list.add(student);
        }
        studentDao.deleteAll(list);
    }




}
