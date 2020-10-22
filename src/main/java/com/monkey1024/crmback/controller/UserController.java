package com.monkey1024.crmback.controller;


import com.monkey1024.crmback.vo.Constant;
import com.monkey1024.crmback.vo.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author monkey1024
 * @since 2020-09-28
 */
@RestController
@RequestMapping("user")
public class UserController {

    @GetMapping("info")
    public Result<Object> selectUserInfo() {
        Result<Object> result = new Result<>();
        result.setResult(Constant.ROLE);
        return result;
    }
}

