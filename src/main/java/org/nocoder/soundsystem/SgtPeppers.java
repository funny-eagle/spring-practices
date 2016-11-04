package org.nocoder.soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created by YANGJINLONG on 2016/11/4.
 */

@Component
public class SgtPeppers implements CompactDisc {
    private String title = " Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = " The Beatles";
    public void play(){
        System.out.println(" Playing " + title + " by " + artist);
    }
}
