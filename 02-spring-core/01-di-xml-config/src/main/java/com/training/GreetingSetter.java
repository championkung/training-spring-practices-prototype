package com.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.net.ApplicationProxy;

/**
 * Created by Champion on 18/7/2560.
 */
public class GreetingSetter {

    private String text = "default setter text";
    private AnotherBean anotherBean;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public AnotherBean getAnotherBean() {
        return anotherBean;
    }

    public void setAnotherBean(AnotherBean anotherBean) {
        this.anotherBean = anotherBean;
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        final GreetingSetter greetingSetter = context.getBean(GreetingSetter.class);

        System.out.println(greetingSetter.getText());
        System.out.println(greetingSetter.getAnotherBean().getName());
    }
}
