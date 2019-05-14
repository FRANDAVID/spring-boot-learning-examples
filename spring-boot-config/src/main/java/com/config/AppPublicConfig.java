package com.config;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * Company lenovo.com Copyright (C) 1984-2019 All Rights Reserved.
 *
 * @author david
 * @version PublicConfig.java, v 0.1 2019-05-14 10:11 david
 * @project spring-boot-learning-examples
 */
@Configuration
@EnableApolloConfig({"lenovoid.public"})
public class AppPublicConfig {


@Value("${redis.cluster.list}")
  private String clusterList;

  public String getClusterList() {
    return clusterList;
  }

  public void setClusterList(String clusterList) {
    this.clusterList = clusterList;
  }
}
