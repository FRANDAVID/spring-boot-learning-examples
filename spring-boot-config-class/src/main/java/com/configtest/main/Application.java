package com.configtest.main;

import com.configtest.config.DataSourceConfig;
import com.configtest.config.FileConfig;
import com.configtest.config.SpringConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

/**
 * Company lenovo.com Copyright (C) 1984-2019 All Rights Reserved.
 *
 * @author david
 * @version Application.java, v 0.1 2019-05-10 15:13 david
 * @project spring-boot-learning-examples
 */
@SpringBootApplication
@Import(SpringConfiguration.class) //启动类导入主配置类文件
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class,
    HibernateJpaAutoConfiguration.class})
public class Application {

  public static void main(String[] args) {
    ConfigurableApplicationContext context = SpringApplication.run(Application.class,args);
    FileConfig fileConfig = context.getBean(FileConfig.class);
    DataSourceConfig dataSourceConfig = context.getBean(DataSourceConfig.class);
    dataSourceConfig.show();
    fileConfig.show();
    context.close();
//    SpringApplication.run(Application.class,args);


  }

}
