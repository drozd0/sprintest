package ru.test.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dm on 20.10.14.
 */
public class MainClass
{
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        context.getBean(TerminatorQuater.class).sayQuater();
    }
}
