package com.org.pattern.facade;

import java.util.ArrayList;
import java.util.Date;

public class TravelFacade {
    private HotelBooker hotelBooker;
    private FlightBooker flightBooker;

    public ArrayList<String> getFlightsAndHotels(Date from, Date to) {
        flightBooker = new FlightBooker();
        hotelBooker = new HotelBooker();
        ArrayList<String> flights = flightBooker.getFlightsFor(from, to);
        ArrayList<String> hotels = hotelBooker.getHotelsFor(from, to);
        ArrayList<String> hotelsWithFlight = new ArrayList<>();
        hotelsWithFlight.addAll(hotels);
        hotelsWithFlight.addAll(flights);
        return hotelsWithFlight;
    }
}
