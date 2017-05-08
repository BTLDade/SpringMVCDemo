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
        return "Hello Junit!";
    }

}
