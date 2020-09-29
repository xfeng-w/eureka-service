package com.xfeng.eurekaservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuefeng.wang
 * @date 2020-09-29
 */
@RestController
@RequestMapping("test")
public class TestController {

    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @GetMapping
    public ResponseEntity<String> test() {
        return new ResponseEntity<>("Test", HttpStatus.OK);
    }
}
