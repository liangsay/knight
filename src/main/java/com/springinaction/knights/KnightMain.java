package com.springinaction.knights;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by liujinliang on 2017/8/16.
 */
public class KnightMain {
    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/spring/knights.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }
}
