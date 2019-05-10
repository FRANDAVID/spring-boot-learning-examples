package com.configtest.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * Company lenovo.com Copyright (C) 1984-2019 All Rights Reserved.
 *
 * @author david
 * @version WebMvcConfiguration.java, v 0.1 2019-05-10 15:16 david
 * @project spring-boot-learning-examples
 */

@Configuration
public class WebMvcConfiguration  {

  @Value("${server.port}")
  private String port;

  public String getPort() {
    return port;
  }

  public void setPort(String port) {
    this.port = port;
  }
}
