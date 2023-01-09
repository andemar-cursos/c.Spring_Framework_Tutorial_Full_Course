package org.andemar.objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {

    @Autowired
    @Qualifier("snapdragon") // This is for select the specific bean that want to use, if exist several
    MobileProcessor cpu;

    public MobileProcessor getCpu() {
        return cpu;
    }

    public void setCpu(MobileProcessor cpu) {
        this.cpu = cpu;
    }

    public void config() {
        System.out.println("Octa Core, 4gb Ram, 12MP Camera");
        cpu.process();
    }
}
