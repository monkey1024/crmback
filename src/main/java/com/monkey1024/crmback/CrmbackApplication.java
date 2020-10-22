package com.monkey1024.crmback;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.monkey1024.crmback.mapper")
@EnableTransactionManagement //开启事务支持
@ServletComponentScan
public class CrmbackApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrmbackApplication.class, args);
    }

}
