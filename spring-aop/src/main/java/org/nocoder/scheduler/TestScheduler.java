package org.nocoder.scheduler;

import org.nocoder.service.SampleAdder;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
@EnableScheduling
public class TestScheduler extends BaseScheduler{

    @Resource
    private SampleAdder sampleAdder;

    @Scheduled(cron = "0/10 * * * * ?")
    public void hello(){
        System.out.println("hello world!");
    }
}
