package com.configtest.controller;

import com.configtest.config.DataSourceConfig;
import com.configtest.config.WebMvcConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Company lenovo.com Copyright (C) 1984-2019 All Rights Reserved.
 *
 * @author david
 * @version testController.java, v 0.1 2019-05-10 15:21 david
 * @project spring-boot-learning-examples
 */
@RestController
@RequestMapping("/")
public class testController {

  @Autowired
  private WebMvcConfiguration webMvcConfiguration;

  @Autowired
  private DataSourceConfig dataSourceConfig;

  @RequestMapping("/test")
  public void  index(){
    System.out.println("--------------------------------------");
    System.out.println(webMvcConfiguration.getPort());
    System.out.println("--------------------------------------");
    System.out.println("--------------------------------------");
    dataSourceConfig.show();
    System.out.println("--------------------------------------");
  }
}
