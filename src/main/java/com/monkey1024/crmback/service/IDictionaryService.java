package com.monkey1024.crmback.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.monkey1024.crmback.entity.DictionaryType;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author monkey1024
 * @since 2020-09-28
 */
public interface IDictionaryService extends IService<DictionaryType> {
    List<DictionaryType> selectAll();
}
