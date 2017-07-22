package com.training;

/**
 * Created by Champion on 18/7/2560.
 */
public class Employee {
    private String firstName = "Humanoid";
    private String lastName = "Champion";
    private int age = 36;


    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
