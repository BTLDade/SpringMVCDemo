package com.btldade.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ak on 2017/5/4.
 */
@Controller
public class TestController {

    @RequestMapping("/web/test")
    String webTest(){
        return "test!";
    }

}
