package com.bridgelabz.hotelreservation;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HotelReservationSystem {
    List<HotelDetails> hotelDetailsList = new ArrayList<>();
    public  void cheapestHotelinWeekdays(){
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
        System.out.println("Hotel Name :" +hotelDetails.getHotelName());
        System.out.println("Total Price Rate  in Hotel :" +hotelDetails.getTotalPrice());

    }


}
