package org.nocoder.soundsystem;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by YANGJINLONG on 2016/11/4.
 */
public class Main {
    public static void main(String [] args){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("org.nocoder.soundsystem");
        SgtPeppers cd = (SgtPeppers) applicationContext.getBean("sgt", SgtPeppers.class);
        cd.play();
    }
}
