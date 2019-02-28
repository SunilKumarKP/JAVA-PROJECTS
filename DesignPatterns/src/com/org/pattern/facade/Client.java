package com.org.pattern.facade;

import java.util.Date;

public class Client {

    public static void main(String[] args) {
        TravelFacade facade = new TravelFacade();
        facade.getFlightsAndHotels(new Date(), new Date());
        System.out.println("Got the Flight and hotel details!");
    }
}
