package com.zhanghongbin.studentdemo.controller;

import com.zhanghongbin.studentdemo.component.ResponseParam;
import com.zhanghongbin.studentdemo.entity.Student;
import com.zhanghongbin.studentdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author dbin
 * @Date 2020/1/26
 **/

@RestController
@RequestMapping(StudentRestController.BaseApi)
public class StudentRestController {
    final static String BaseApi = "/api/zhb/student";

    @Autowired
    StudentService studentService;

    @RequestMapping("/query")
    public ResponseParam query(HttpServletRequest request){


        return ResponseParam.success().datalist(studentService.findAll());
    }

    @RequestMapping("save")
    public ResponseParam save(Student student) {

        return ResponseParam.success();
    }

    @RequestMapping("dels")
    public ResponseParam delete(String ids) {
        studentService.deletes(ids);
        return ResponseParam.success();
    }

}
