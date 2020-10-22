package com.monkey1024.crmback.controller;


import com.monkey1024.crmback.entity.DictionaryType;
import com.monkey1024.crmback.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author monkey1024
 * @since 2020-09-28
 */
@RestController
@RequestMapping("dictionary")
public class DictionaryController {

    @Autowired
    private IDictionaryService dictionaryService;

    @GetMapping("type")
    public List<DictionaryType> selectDictionaryType() {

        return dictionaryService.selectAll();
    }

}

