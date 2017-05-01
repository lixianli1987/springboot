package com.test.cms.api.core;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/4/30 0030.
 */
@RestController
@RequestMapping("/api/test")
public class TestController {

    @RequestMapping()
    public String test(){
        String cc = "hello test!";
        return cc;
    }
}
