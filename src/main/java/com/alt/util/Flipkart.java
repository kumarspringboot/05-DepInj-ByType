package com.alt.util;

import com.alt.com.alt.service.Courier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Flipkart {




    //    @Autowired
//    @Qualifier("bluedartCourier")
    private Courier courier;

    @Autowired
    public void setCourier(@Qualifier("bluedartCourier")Courier courier) {
        this.courier = courier;
    }
//    public Flipkart(@Qualifier("dtdcCourier")Courier courier) {
//        this.courier = courier;
//    }
    public void sendCourier(int orderId,String addr) {
    courier.delivery(orderId,addr);
    }
}
