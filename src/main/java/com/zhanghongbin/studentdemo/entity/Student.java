package com.zhanghongbin.studentdemo.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * student基本信息实体对象
 */

@Entity
@Table(name="student")
@Setter
@Getter
public class Student {  // extends AppJpaBaseEntity

	/**
	 *  主键
	 */
	@Column(
			name = "create_user_id",
			length = 128,
			updatable = false,
			nullable = true
	)
	@Id
	@GeneratedValue
	private String id;
	/**
	 * 姓名
	 */
	@Column(name="name")
	private String name ;


	/**
	 * 性别
	 */
	@Column(name="gender")
	private String gender ;


	/**
	 * 身份证号
	 */
	@Column(name="id_card")
	private String idCard ;


	/**
	 * 手机号
	 */
	@Column(name="telphone")
	private String telphone ;


	/**
	 * 学号
	 */
	@Column(name="student_number")
	private String studentNumber ;


	/**
	 * 出生年月日
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(pattern="yyyy-MM-dd")
	@Column(name="birth")
	private Date birth ;

	@Column(name="address")
	private String address;

}
