package com.monkey1024.crmback.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author monkey1024
 * @since 2020-09-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_user")
public class User implements Serializable {

private static final long serialVersionUID=1L;


    private String name;

    private String password;

    private String phone;

    private String status;

    private Integer deptId;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;


}
