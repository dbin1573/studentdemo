package com.zhanghongbin.studentdemo.controller;

import com.zhanghongbin.studentdemo.component.ResponseParam;
import com.zhanghongbin.studentdemo.dao.OrgLifeDao;
import com.zhanghongbin.studentdemo.entity.OrgLife;
import com.zhanghongbin.studentdemo.entity.Student;
import com.zhanghongbin.studentdemo.service.StudentService;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.WebServiceRef;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Author dbin
 * @Date 2020/1/26
 **/

@RestController
@RequestMapping(orglifeController.BaseApi)
public class orglifeController {
    public static final String BaseApi = "api/orglife";

    @Autowired
    OrgLifeDao orgLifeDao;

    @RequestMapping("list")
    public ResponseParam find(){
        List<OrgLife> list=  orgLifeDao.findAll();

        return ResponseParam.success().datalist(list);
    }
    @RequestMapping("getOrgLifeById")
    public ResponseParam getOrgLifeById(Long id){
        OrgLife orgLife=  orgLifeDao.getOne(id);

        return ResponseParam.success().data(orgLife);
    }

    @RequestMapping("save")
    public ResponseParam save(OrgLife orgLife) {
        orgLifeDao.save(orgLife);
        return ResponseParam.saveSuccess();
    }
    @RequestMapping("dels")
    public ResponseParam dels(String ids) {
        List<OrgLife> orgLifeList= Lists.newArrayList();
        String [] idArr=ids.split(",");
        for (String id : idArr) {
            OrgLife orgLife=new OrgLife();
            orgLife.setId(id);
            orgLifeList.add(orgLife);
        }

        orgLifeDao.deleteAll(orgLifeList);
        return ResponseParam.saveSuccess();
    }



}
