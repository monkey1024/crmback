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
@TableName("t_activity")
public class Activity implements Serializable {

private static final long serialVersionUID=1L;

    private String activityName;

    private String content;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;


}
