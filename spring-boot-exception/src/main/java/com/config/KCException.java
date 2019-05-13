package com.config;

/**
 * Company lenovo.com Copyright (C) 1984-2019 All Rights Reserved.
 *
 * @author david
 * @version KCException.java, v 0.1 2019-05-07 21:31 david
 * @project spring-boot-learning-examples
 */
public class KCException extends Exception {
  private int code;
  private String message;

  public KCException(String message, int code) {
    super(message);
    this.code = code;
    this.message = message;
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  @Override
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
