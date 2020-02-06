package com.zhanghongbin.studentdemo.component;

import java.util.HashMap;

/**
 * @Author dbin
 * @Date 2020/1/19
 **/

public class ResponseParam extends HashMap<String, Object> {

    public ResponseParam(){
    }

    public static ResponseParam info(boolean flag){
        return flag ? success() : fail();
    }

    public static ResponseParam success() {
        return success(true);
    }

    public static ResponseParam fail() {
        return success(false);
    }

    public static ResponseParam success(boolean flag) {
        ResponseParam successParam = new ResponseParam();
        successParam.put("success", flag);
        return successParam;
    }

    public static ResponseParam saveSuccess() {
        ResponseParam successParam =success();
        successParam.message("添加成功");
        return successParam;
    }
    public static ResponseParam saveFail() {
        ResponseParam failParam =fail();
        failParam.message("添加失败");
        return failParam;
    }
    public static ResponseParam updateSuccess() {
        ResponseParam successParam =success();
        successParam.message("更新成功");
        return successParam;
    }
    public static ResponseParam updateFail() {
        ResponseParam failParam =fail();
        failParam.message("更新失败");
        return failParam;
    }

    public static ResponseParam deleteSuccess() {
        ResponseParam successParam =success();
        successParam.message("删除成功");
        return successParam;
    }
    public static ResponseParam deleteFail() {
        ResponseParam failParam =fail();
        failParam.message("删除失败");
        return failParam;
    }




    public ResponseParam message(Object value){
        this.put("message", value);
        return this;
    }

    public ResponseParam data(Object value) {
        this.put("data", value);
        return this;
    }

    public ResponseParam datalist(Iterable<?> value) {
        this.put("datalist", value);
        return this;
    }



}
