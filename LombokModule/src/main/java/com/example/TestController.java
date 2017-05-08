package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ak on 2017/5/4.
 */
@RestController
public class TestController {

    @RequestMapping("/api/test")
    String test(){
        return "Hello Spring Boot!";
    }

    @RequestMapping("/api/bean")
    TestBean bean(){
        TestBean tb = new TestBean();
        tb.setAge(12);
        tb.setName("dade");
        return tb;
    }

}
