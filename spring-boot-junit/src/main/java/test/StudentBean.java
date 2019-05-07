package test;

/**
 * Company lenovo.com Copyright (C) 1984-2019 All Rights Reserved.
 *
 * @author david
 * @version test.StudentBean.java, v 0.1 2019-05-07 18:07 david
 * @project spring-boot-learning-examples
 */
public class StudentBean {

  private String name;

  public StudentBean(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
