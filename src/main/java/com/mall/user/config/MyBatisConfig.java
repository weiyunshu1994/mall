package com.mall.user.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 */
@Configuration
@MapperScan("com.mall.user.mbg.mapper")
public class MyBatisConfig {
//    @Autowired
//    private
}
