package org.andemar.configuration;

import org.andemar.objects.MobileProcessor;
import org.andemar.objects.Samsung;
import org.andemar.objects.Snapdragon;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.andemar")
public class AppConfig {
//    @Bean
//    public Samsung getPhone() {
//        return new Samsung();
//    }
//
//    @Bean
//    public MobileProcessor getProcessor() {
//        return new Snapdragon();
//    }
}
