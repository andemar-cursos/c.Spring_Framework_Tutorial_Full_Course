package org.andemar.objects;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary This is to use to take this beans is there are several
public class MediaTek implements MobileProcessor {
    @Override
    public void process() {
        System.out.println("2nd Best CPU");
    }
}
