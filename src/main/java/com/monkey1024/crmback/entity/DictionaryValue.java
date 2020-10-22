package com.monkey1024.crmback.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

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
@TableName("t_dictionary_value")
public class DictionaryValue implements Serializable {

private static final long serialVersionUID=1L;

    private Integer id;

    private String value;

    private String text;

    private Integer typeId;


}
