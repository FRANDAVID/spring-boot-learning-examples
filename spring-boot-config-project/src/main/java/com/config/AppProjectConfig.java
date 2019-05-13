package com.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration //表明此类是配置类
@ComponentScan // 扫描自定义的组件(repository service component controller)
@PropertySource("classpath:application.properties") // 读取application.properties
//@MapperScan("com.bdqn.lyrk.ssm.study.app.mapper") //扫描Mybatis的Mapper接口
//@EnableTransactionManagement //开启事务管理
@EnableSpringStudy
public class AppProjectConfig {

}