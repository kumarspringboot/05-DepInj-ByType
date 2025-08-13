package com.alt;

import com.alt.util.Flipkart;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {


        ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);

        Flipkart flipkartBean = run.getBean(Flipkart.class);
        flipkartBean.sendCourier(1001,"mumbai");

    }

}
