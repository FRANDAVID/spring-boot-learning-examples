package com.config.learn.test;

import java.util.concurrent.TimeUnit;
import org.junit.Test;

/**
 * Company lenovo.com Copyright (C) 1984-2019 All Rights Reserved.
 *
 * @author david
 * @version JunitTest.java, v 0.1 2019-05-07 17:53 david
 * @project spring-boot-learning-examples
 */
public class JunitTest {

  @Test(timeout = 100000)
  public void testTimeout() throws InterruptedException {
    TimeUnit.SECONDS.sleep(2);
    System.out.println("Complete");
  }

  @Test(expected = NullPointerException.class)
  public void testNullException() {
    throw new NullPointerException();
  }
}
