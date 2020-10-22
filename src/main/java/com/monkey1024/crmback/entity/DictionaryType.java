package com.monkey1024.crmback.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

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
@TableName("t_dictionary_type")
public class DictionaryType implements Serializable {

private static final long serialVersionUID=1L;

    private Integer id;

    private String code;

    private String name;

    private String description;

    @TableField(exist = false)//不是数据库中的字段
    private List<DictionaryValue> values;


}
