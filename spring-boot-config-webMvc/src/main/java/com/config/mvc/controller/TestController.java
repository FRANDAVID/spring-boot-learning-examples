package com.config.mvc.controller;

import com.config.StudentBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Company lenovo.com Copyright (C) 1984-2019 All Rights Reserved.
 *
 * @author david
 * @version TestController.java, v 0.1 2019-05-08 19:30 david
 * @project spring-boot-learning-examples
 */
@Controller
@RequestMapping(value="/test")
public class TestController {

  @Autowired
  private StudentBean studentBean;
  @Value("${test.name}")
  private String name;
  @RequestMapping(value="/test",method = RequestMethod.GET)
  public void index(){
    System.out.println("------------controller invoke---------------");
    System.out.println(studentBean.getName());
    System.out.println("----------------configName----------------------------");
    System.out.println(name);
  }

}
