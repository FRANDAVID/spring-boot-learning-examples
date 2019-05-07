package com;

import java.io.IOException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Company lenovo.com Copyright (C) 1984-2019 All Rights Reserved.
 *
 * @author david
 * @version Application.java, v 0.1 2019-05-07 16:26 david
 * @project spring-boot-learning-examples
 */
public class Application {
  public static void main(String[] args) throws IOException {
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppProjectConfig.class);
    StudentBean studentBean = applicationContext.getBean(StudentBean.class);
    System.out.println(studentBean.getName());
  }

}
