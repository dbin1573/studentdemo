package com.zhanghongbin.studentdemo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @Author dbin
 * @Date 2020/2/6
 **/

@Getter
@Setter
@Entity
@Table(name = "orglife")
public class OrgLife {
    @Id
    private String id;
    private String title;
    private String orgName;
    private Integer num;
    private String type;
    private Date startTime;
    private Date endTime;
}
