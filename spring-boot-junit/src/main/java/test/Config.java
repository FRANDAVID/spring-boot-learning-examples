package test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Company lenovo.com Copyright (C) 1984-2019 All Rights Reserved.
 *
 * @author david
 * @version test.Config.java, v 0.1 2019-05-07 18:06 david
 * @project spring-boot-learning-examples
 */
@Configuration
@ComponentScan
public class Config {
  @Bean
  public StudentBean studentBean() {
    return new StudentBean("test");
  }
}
