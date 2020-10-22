package com.monkey1024.crmback.service.impl;

import com.monkey1024.crmback.entity.Customer;
import com.monkey1024.crmback.mapper.CustomerMapper;
import com.monkey1024.crmback.service.ICustomerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements ICustomerService {

}
