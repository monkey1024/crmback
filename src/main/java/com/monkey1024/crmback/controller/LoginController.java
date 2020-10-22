package com.monkey1024.crmback.controller;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.monkey1024.crmback.entity.User;
import com.monkey1024.crmback.service.IUserService;
import com.monkey1024.crmback.util.JwtUtil;
import com.monkey1024.crmback.vo.Constant;
import com.monkey1024.crmback.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashSet;
import java.util.Objects;

/**
 *  登录controller
 */
@RestController
public class LoginController {

    @Autowired
    private IUserService userService;

    /**
     *  登录
     * @param param
     * @param request
     * @return
     */
    @PostMapping("login")
    public Result<JSONObject> login(@RequestBody User param, HttpServletRequest request) {
        Result<JSONObject> result = new Result<>();

        //构建查询wrapper
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getName,param.getName());

        User user = userService.getOne(queryWrapper);

        if (user == null) {
            result.setMessage("用户名不存在");
        }else if (!Objects.equals(user.getPassword(),param.getPassword())){
            result.setMessage("用户名或密码不对");
        }else {
            //生成token
            String token = JwtUtil.sign(user.getName(), user.getPassword());
            //放入到servletContext中
            HashSet<String> tokenSet = (HashSet)request.getServletContext().getAttribute("tokenSet");
            tokenSet.add(token);
            request.getServletContext().setAttribute("tokenSet",tokenSet);

            //将token放入到result中
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("token", token);
            jsonObject.put("user", user);

            result.setResult(jsonObject);
            result.setMessage("登录成功");
            result.setSuccess(true);
        }

        return result;
    }


    /**
     *  退出
     * @param request
     * @param response
     * @return
     */
    @PostMapping("logout")
    public Result<Object> logout(HttpServletRequest request, HttpServletResponse response) {
        Result<Object> result = new Result<>();

        //获取token
        String token = request.getHeader(Constant.X_ACCESS_TOKEN);
        //从servletContext域中移除该token
        HashSet<String> tokenSet = (HashSet)request.getServletContext().getAttribute("tokenSet");
        if (tokenSet.contains(token)) {
            tokenSet.remove(token);
            result.setMessage("退出成功");
        }else {
            result.setMessage("token无效");
        }


        return result;
    }
}
