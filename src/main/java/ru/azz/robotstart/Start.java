package ru.azz.robotstart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.azz.robot.ModelT1000;

public class Start {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        ModelT1000 obj = (ModelT1000) context.getBean("model1");
        obj.action();
        obj = (ModelT1000) context.getBean("model2");
        obj.action();
    }
}
