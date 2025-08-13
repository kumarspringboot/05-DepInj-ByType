package com.alt.serviceImpl;

import com.alt.com.alt.service.Courier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("bluedartCourier")
//@Primary
public class BlueDart implements Courier {

    public BlueDart() {
        System.out.println("Bluedart Constructor");
    }
    @Override
    public void delivery(int orderId, String addr) {
        System.out.println("Courier " + orderId + " delivered to location " + addr + "through courier partner is BlueDart");
    }
}
