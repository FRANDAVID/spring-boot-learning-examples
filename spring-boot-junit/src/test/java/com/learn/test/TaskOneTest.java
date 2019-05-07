package com.learn.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

public class TaskOneTest {
    @Test
    public void test() {
        System.out.println("Task one do.");
    }
}
class TaskTwoTest {
    @Test
    public void test() {
        System.out.println("Task two do.");
    }
}
 class TaskThreeTest {
    @Test
    public void test() {
        System.out.println("Task Three.");
    }
}
@RunWith(Suite.class) // 1. 更改测试运行方式为 Suite
// 2. 将测试类传入进来
@Suite.SuiteClasses({TaskOneTest.class, TaskTwoTest.class, TaskThreeTest.class})
 class SuitTest {
    /**
     * 测试套件的入口类只是组织测试类一起进行测试，无任何测试方法，
     */
}