package com.training.annotation;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Champion on 18/7/2560.
 */
public class AddressApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        final AddressBean addressBean = context.getBean(AddressBean.class);
        final CompanyBean companyBean = context.getBean(CompanyBean.class);

        System.out.println("addressBean " + addressBean.getDistrict());

        addressBean.setStreet("Lumlukka");
        addressBean.setDistrict("Lumlukka");
        addressBean.setProvince("Phathum Thani");

        //companyBean.setName("CORE SOLUTIONS");

        final EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
        final String province = employeeBean.getAddressBean().getProvince();
        final String district = employeeBean.getAddressBean().getDistrict();
        final String street = employeeBean.getAddressBean().getStreet();
        final String company = companyBean.getName();
        final String company2 = companyBean.getName2();

        System.out.println("street : " + street);
        System.out.println("district : " + district);
        System.out.println("province : " + province);
        System.out.println("company : " + company);
        System.out.println("company2 : " + company2);

    }
}
