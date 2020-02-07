package com.zhanghongbin.studentdemo.controller;

import com.zhanghongbin.studentdemo.component.ResponseParam;
import com.zhanghongbin.studentdemo.dao.OrgLifeDao;
import com.zhanghongbin.studentdemo.entity.OrgLife;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

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
    public ResponseParam getOrgLifeById(@RequestBody Map<String,Integer> id){

        OrgLife orgLife = orgLifeDao.getOne(id.get("id"));
        return ResponseParam.success().data(orgLife);
    }

    @RequestMapping("saveInfo")
    public ResponseParam save(@RequestBody OrgLife orgLife) {

        orgLifeDao.save(orgLife);

        return ResponseParam.saveSuccess();
    }
    @RequestMapping("dels")
    public ResponseParam dels(@RequestBody String[] ids) {
        List<OrgLife> orgLifeList= Lists.newArrayList();
//        String [] idArr=ids.split(",");
        for (String id : ids) {
            OrgLife orgLife=new OrgLife();
            orgLife.setId(Integer.parseInt(id));
            orgLifeList.add(orgLife);
        }

        orgLifeDao.deleteAll(orgLifeList);
        return ResponseParam.saveSuccess();
    }


}
