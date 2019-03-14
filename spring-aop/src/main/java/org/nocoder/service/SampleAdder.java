package org.nocoder.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SampleAdder {
    private Logger logger = LoggerFactory.getLogger(SampleAdder.class);

    public int add(int a, int b){
        logger.info("进入加法...");
        return a + b;
    }
}
