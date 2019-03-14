package org.nocoder.controller;

import org.nocoder.service.SampleAdder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {

    @Resource
    private SampleAdder sampleAdder;

    @GetMapping("/hello")
    public void hello(){
        sampleAdder.add(1, 2);
    }
}
