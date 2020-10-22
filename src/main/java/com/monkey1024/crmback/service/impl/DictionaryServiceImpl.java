package com.monkey1024.crmback.service.impl;

import com.monkey1024.crmback.entity.DictionaryType;
import com.monkey1024.crmback.mapper.DictionaryMapper;
import com.monkey1024.crmback.service.IDictionaryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author monkey1024
 * @since 2020-09-28
 */
@Service
public class DictionaryServiceImpl extends ServiceImpl<DictionaryMapper, DictionaryType> implements IDictionaryService {

    @Autowired
    private DictionaryMapper dictionaryMapper;

    @Override
    public List<DictionaryType> selectAll() {
        return dictionaryMapper.selectAll();
    }
}
