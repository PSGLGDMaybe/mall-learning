package com.macro.mall.tiny.config;
/**
 * @Classname MyBatisConfig
 * @Description TODO
 * @Date 2020/8/25 14:34
 * @Created by wuhaitao
 */

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Create by wht on
 */
@Configuration
@MapperScan("com.macro.mall.tiny.mbg.mapper")
public class MyBatisConfig {
}
