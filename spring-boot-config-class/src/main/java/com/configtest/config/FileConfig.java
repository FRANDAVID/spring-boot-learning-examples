package com.configtest.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/**
 * Company lenovo.com Copyright (C) 1984-2019 All Rights Reserved.
 *
 * @author david
 * @version FileConfig.java, v 0.1 2019-05-10 17:02 david
 * @project spring-boot-learning-examples
 */
@Configuration
@PropertySources({@PropertySource("classpath:jdbc.properties"),@PropertySource("classpath:user.properties")})
@ConfigurationProperties(prefix = "user")
public class FileConfig {

  private String name;
  private String addr;

  public void show(){
    StringBuffer buffer = new StringBuffer();
    buffer.append("name="+name).append(",addr="+addr);
    System.out.println(buffer.toString());
  }
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddr() {
    return addr;
  }

  public void setAddr(String addr) {
    this.addr = addr;
  }
}
