package com.btldade.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ak on 2017/5/3.
 */
@RestController
public class TestController {

    @RequestMapping("/api/test")
    public String test(){
        return "test";
    }

}
