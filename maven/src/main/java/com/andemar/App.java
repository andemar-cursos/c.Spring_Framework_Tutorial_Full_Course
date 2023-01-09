package com.andemar;

import com.andemar.interfaces.Vehicle;
import com.andemar.object.Car;
import com.andemar.object.Tyre;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Car obj = (Car) context.getBean("car");
        obj.drive();

//        Tyre t = (Tyre) context.getBean("tyre");
//        System.out.println(t);
    }
}
