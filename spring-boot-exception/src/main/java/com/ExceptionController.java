package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Company lenovo.com Copyright (C) 1984-2019 All Rights Reserved.
 *
 * @author david
 * @version ExceptionController.java, v 0.1 2019-05-07 21:37 david
 * @project spring-boot-learning-examples
 */
@RestController
@RequestMapping(value = "/")
public class ExceptionController {

  @GetMapping("exception")
  public ResponseBody test() throws KCException {
    throw new KCException("2222",222);

  }
}
