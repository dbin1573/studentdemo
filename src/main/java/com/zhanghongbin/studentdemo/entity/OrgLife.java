package com.zhanghongbin.studentdemo.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import net.bytebuddy.implementation.bind.annotation.Default;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * @Author dbin
 * @Date 2020/2/6
 **/

@Getter
@Setter
@Entity
@Table(name = "orglife")
@ToString
public class OrgLife {

//    @GeneratedValue(generator="sys_uid")
//    @GenericGenerator(name="sys_uid", strategy="uuid")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "title")
    private String title;
    @Column(name ="org_name")
    private String orgName;
    @Column(name ="num")
    private Integer num;
    @Column(name ="type")
    private String type;
    @Column(name ="start_time")
    @Builder.Default
    @DateTimeFormat(pattern = "YYYY-MM-DD HH-mm")
    private Date startTime=new Date();
    @Column(name ="end_time")
    private Date endTime;
}
