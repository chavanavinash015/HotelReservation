package com.bridgelabz.hotelreservation;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HotelReservationSystem {
    List<HotelDetails> hotelDetailsList = new ArrayList<>();
    public  void cheapestHotelinWeekdays(){
        System.out.println("****************************************");
        System.out.println("Cheapest Hotel in a one day");
        int checkindate = 20-10-2022;
        int checkoutdate = 22-10-2022;
        int stayinHotelDay = checkoutdate - checkindate;
      //  System.out.println(stayinHotelDay);

        hotelDetailsList.add(new HotelDetails("Lakewood",110,80,90,80,3));
        hotelDetailsList.add(new HotelDetails("Bridgewood,",160,110,60,50,4));
        hotelDetailsList.add(new HotelDetails("Ridgewood",220,100,150,40,5));
      //  System.out.println(hotelDetailsList);

     HotelDetails cheaphotel = (HotelDetails) hotelDetailsList.stream().filter(x -> x.weekdaysRates < 220).min(Comparator.comparing(HotelDetails::getWeekdaysRates)).get();
          //     System.out.println(cheaphotel);


        HotelDetails hotelDetails = new HotelDetails();
        hotelDetails.setHotelName(cheaphotel.getHotelName());
        hotelDetails.setTotalPrice(cheaphotel.getWeekdaysRates()*stayinHotelDay);
        System.out.println("Hotel Name : " +hotelDetails.getHotelName());
        System.out.println("Total Price Rate for one day in Hotel : " +hotelDetails.getTotalPrice());
        System.out.println("***********************************************");
    }

    public void cheapestHotelinWeekend() {
        System.out.println("Cheapest Hotel in a week ");
        int checkInDate = 20 - 10 - 2022;
        int checOutDate = 27 - 10 - 2022;
        int stayinHotelDay = checOutDate - checkInDate;
        // System.out.println(stayinHotelDay);

        hotelDetailsList.add(new HotelDetails("Lakewood", 110, 80, 90, 80, 3));
        hotelDetailsList.add(new HotelDetails("Bridgewood,", 160, 110, 60, 50, 4));
        hotelDetailsList.add(new HotelDetails("Ridgewood", 220, 100, 150, 40, 5));
        // System.out.println(hotelDetailsList);

        HotelDetails cheapHotel = hotelDetailsList.stream().filter(x -> x.weekenddayRates < 150).min(Comparator.comparing(HotelDetails::getWeekenddayRates)).get();
        //  System.out.println(cheapHotel);

        HotelDetails hotelDetails = new HotelDetails();
        hotelDetails.setHotelName(cheapHotel.getHotelName());
        hotelDetails.setTotalPrice(cheapHotel.getWeekenddayRates() * stayinHotelDay);
        System.out.println("Hotel Name : " + hotelDetails.getHotelName());
        System.out.println("Total price rate for week in Hotel : " + hotelDetails.getTotalPrice());

    }

}
