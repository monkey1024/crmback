package com.monkey1024.crmback.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.monkey1024.crmback.entity.DictionaryType;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author monkey1024
 * @since 2020-09-28
 */
public interface DictionaryMapper extends BaseMapper<DictionaryType> {

    List<DictionaryType> selectAll();
}
