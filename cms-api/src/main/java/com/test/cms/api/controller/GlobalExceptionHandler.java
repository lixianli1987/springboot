package com.test.cms.api.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/5/7 0007.
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    /**
     * 处理全局异常
     * @param exception
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    public Map<String,Object> handlerGlobalException(Exception exception){
        Map<String,Object> map = new HashMap();
        exception.printStackTrace();
        map.put("code","0002");
        map.put("message","系统错误，请查看日志!");
        return map;
    }
}
