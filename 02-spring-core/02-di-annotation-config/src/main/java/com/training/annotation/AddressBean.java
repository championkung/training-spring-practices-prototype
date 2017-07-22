package com.training.annotation;

import org.springframework.stereotype.Component;

import javax.swing.*;

/**
 * Created by amanurat on 3/15/2016 AD.
 */
@Component
public class AddressBean {

    private String street;
    private String district;
    private String province;


    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
