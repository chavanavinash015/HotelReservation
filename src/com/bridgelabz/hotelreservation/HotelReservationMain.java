package com.bridgelabz.hotelreservation;

import java.util.ArrayList;
import java.util.List;

public class HotelReservationMain {

    public static void main(String[] args) {
        System.out.println("Welcome to the Hotel Reservation Program ");

        List<HotelDetails> hotelDetailsList = new ArrayList<>();
        HotelDetails hotelDetails = new HotelDetails("Lakewood",110,80,90,80,3);
        HotelDetails hotelDetails1= new HotelDetails("Bridgewood,",160,110,60,50,4);
        HotelDetails hotelDetails2= new HotelDetails("Ridgewood",220,100,150,40,5);
//        System.out.println(hotelDetails);
//        System.out.println(hotelDetails1);
//        System.out.println(hotelDetails2);

        hotelDetailsList.add(hotelDetails);
        hotelDetailsList.add(hotelDetails1);
        hotelDetailsList.add(hotelDetails2);

        System.out.println(hotelDetailsList);

        HotelReservationSystem check = new HotelReservationSystem();
        check.cheapestHotelinWeekdays();
    }
}
