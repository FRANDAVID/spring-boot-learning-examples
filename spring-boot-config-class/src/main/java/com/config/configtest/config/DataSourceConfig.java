package com.config.configtest.config;

import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Company lenovo.com Copyright (C) 1984-2019 All Rights Reserved.
 *
 * @author david
 * @version DataSourceConfig.java, v 0.1 2019-05-10 15:59 david
 * @project spring-boot-learning-examples
 */
@Component
@ConfigurationProperties(prefix = "ds")
public class DataSourceConfig {

  private String url;

  private String driverClassName;

  private String username;

  private String password;

  private List<String> hosts = new ArrayList();

  private String[] ports;

  public void show(){
    StringBuffer buffer = new StringBuffer();
    buffer.append(this.url).append(",").append(this.username).append(this.password)
        .append(this.driverClassName).append(hosts).append(ports);
    System.out.println(buffer.toString());
  }

  public List<String> getHosts() {
    return hosts;
  }

  public void setHosts(List<String> hosts) {
    this.hosts = hosts;
  }

  public String[] getPorts() {
    return ports;
  }

  public void setPorts(String[] ports) {
    this.ports = ports;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getDriverClassName() {
    return driverClassName;
  }

  public void setDriverClassName(String driverClassName) {
    this.driverClassName = driverClassName;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
