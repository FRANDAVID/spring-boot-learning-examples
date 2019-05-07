package test;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * Company lenovo.com Copyright (C) 1984-2019 All Rights Reserved.
 *
 * @author david
 * @version EmployeeService.java, v 0.1 2019-05-07 18:15 david
 * @project spring-boot-learning-examples
 */
@Service
public class EmployeeService {

   public List<StudentBean> findList() {
      ArrayList<StudentBean> resultList = new ArrayList<>();
      resultList.add(new StudentBean("test1"));
      resultList.add(new StudentBean("test2"));
      return resultList;

   }
}
