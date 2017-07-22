package com.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Champion on 18/7/2560.
 */
public class GreetingConstructor {

//    private String text = "default constructor text";
    private String firstName = "default firstName";
    private String lastName = "default lastName";



    public GreetingConstructor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        GreetingConstructor greetingconstrutor = context.getBean(GreetingConstructor.class);
        System.out.println(greetingconstrutor.getFullName());
    }
}
