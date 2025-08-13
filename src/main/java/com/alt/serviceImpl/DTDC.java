package com.alt.serviceImpl;


import com.alt.com.alt.service.Courier;
import org.springframework.stereotype.Service;

@Service("dtdcCourier")
public class DTDC implements Courier {

    public DTDC() {
    System.out.println("DTDC Constructor");
    }
    @Override
    public void delivery(int orderId, String addr) {
    System.out.println("Courier " + orderId + " delivered to location " + addr + "through courier partner is DTDC");
    }
}
