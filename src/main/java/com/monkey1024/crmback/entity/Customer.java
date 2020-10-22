package com.monkey1024.crmback.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

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
@TableName("t_customer")
public class Customer implements Serializable {

private static final long serialVersionUID=1L;

    private String customerName;

    private String phone;

    private String grade;

    private String carType;

    private String lost;

    private String drive;

    private Integer contactCount;

    private Integer activityId;

    private Integer userId;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;


}
