package com.config;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Company lenovo.com Copyright (C) 1984-2019 All Rights Reserved.
 *
 * @author david
 * @version ApolloConfig.java, v 0.1 2019-05-14 00:33 david
 * @project spring-boot-learning-examples
 */
@Configuration
@EnableApolloConfig
public class ApolloConfig {
  @Bean
  public TestJavaConfigBean javaConfigBean() {
    return new TestJavaConfigBean();
  }
}
