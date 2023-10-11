package com.easyBuy.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        ApplicationContext ap=new ClassPathXmlApplicationContext("/SpringOnly/applicationContext.xml");

//        HelloSpring helloSpring=(HelloSpring)ap.getBean("spring_constructor");
//        System.out.println("通过构造器注入");
//        System.out.println(helloSpring);
//        helloSpring = (HelloSpring)ap.getBean("helloSpring");
//        System.out.println("通过GetSet方法注入");
//        System.out.println(helloSpring);
//        helloSpring = (HelloSpring) ap.getBean("helloSpring3");
//        System.out.println("命名空间方法注入");
//        System.out.println(helloSpring);
        HelloSpring helloSpring=(HelloSpring)ap.getBean("helloSpring");
        System.out.println("通过Component注解方法");
        System.out.println(helloSpring);
    }
}
