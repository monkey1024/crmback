package com.monkey1024.crmback.controller;


import com.monkey1024.crmback.entity.DictionaryType;
import com.monkey1024.crmback.service.IDictionaryService;
import com.monkey1024.crmback.vo.Constant;
import com.monkey1024.crmback.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
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

    /*
        删除
     */
    @DeleteMapping("type")
    public Result<DictionaryType> deleteDictionaryType(String ids){
        Result<DictionaryType> result = new Result<>();
        try {
            dictionaryService.batchDeleteDictionary(ids);
        } catch (Exception e) {
            result.setSuccess(false);
            result.setMessage(Constant.ADD_FAIL);
            e.printStackTrace();
        }
        return result;
    }

    /*
        新增
     */
    @PostMapping("type")
    public Result<DictionaryType> addDictionaryType(DictionaryType dictionaryType){
        Result<DictionaryType> result = new Result<>();
        try {
            dictionaryService.save(dictionaryType);
        } catch (Exception e) {
            result.setSuccess(false);
            result.setMessage(Constant.ADD_FAIL);
            e.printStackTrace();
        }
        return result;
    }

    /*
        修改
     */
    @PutMapping("type")
    public Result<DictionaryType> updateDictionaryType(DictionaryType dictionaryType){
        Result<DictionaryType> result = new Result<>();
        try {
            dictionaryService.updateById(dictionaryType);
        } catch (Exception e) {
            result.setSuccess(false);
            result.setMessage(Constant.UPDATE_FAIL);
            e.printStackTrace();
        }
        return result;
    }

    /**
     *  查询
     * @return
     */
    @GetMapping("type")
    public Result<HashMap<String, List<DictionaryType>>> selectDictionaryType() {
        Result<HashMap<String, List<DictionaryType>>> result = new Result<>();
        try {
            List<DictionaryType> list = dictionaryService.selectAll();
            HashMap<String, List<DictionaryType>> map = new HashMap<>();
            map.put("data", list);
            result.setMessage("查询成功");
            result.setResult(map);
        } catch (Exception e) {
            result.setSuccess(false);
            result.setMessage("查询失败");
            e.printStackTrace();
        }
        return result;
    }

}

