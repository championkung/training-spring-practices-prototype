package com.training.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by amanurat on 3/15/2016 AD.
 */
@Component
public class CompanyBean {

    @Value("${company.name}")
    private String name;

    @Value("${champ}")
    private String name2;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }
}
