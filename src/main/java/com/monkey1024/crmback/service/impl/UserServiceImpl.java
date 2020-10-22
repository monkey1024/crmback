package com.monkey1024.crmback.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.monkey1024.crmback.entity.User;
import com.monkey1024.crmback.mapper.UserMapper;
import com.monkey1024.crmback.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author monkey1024
 * @since 2020-09-28
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
}
