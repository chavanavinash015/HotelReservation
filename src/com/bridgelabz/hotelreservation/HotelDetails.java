package com.bridgelabz.hotelreservation;

public class HotelDetails {

    String hotelName;
    int weekdaysRates;
    int rewardCustomerWeek;
    int weekenddayRates;
    int rewardCustomerWeekend;
    int hotelRatings;
    int regularCustomer;
    int totalPrice;

    public HotelDetails(String hotelName, int weekdaysRates, int rewardCustomerWeek, int weekenddayRates, int rewardCustomerWeekend, int hotelRatings) {
        this.hotelName = hotelName;
        this.weekdaysRates = weekdaysRates;
        this.rewardCustomerWeek = rewardCustomerWeek;
        this.weekenddayRates = weekenddayRates;
        this.rewardCustomerWeekend = rewardCustomerWeekend;
        this.hotelRatings = hotelRatings;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getWeekdaysRates() {
        return weekdaysRates;
    }

    public void setWeekdaysRates(int weekdaysRates) {
        this.weekdaysRates = weekdaysRates;
    }

    public int getRewardCustomerWeek() {
        return rewardCustomerWeek;
    }

    public void setRewardCustomerWeek(int rewardCustomerWeek) {
        this.rewardCustomerWeek = rewardCustomerWeek;
    }

    public int getWeekenddayRates() {
        return weekenddayRates;
    }

    public void setWeekenddayRates(int weekenddayRates) {
        this.weekenddayRates = weekenddayRates;
    }

    public int getRewardCustomerWeekend() {
        return rewardCustomerWeekend;
    }

    public void setRewardCustomerWeekend(int rewardCustomerWeekend) {
        this.rewardCustomerWeekend = rewardCustomerWeekend;
    }

    public int getHotelRatings() {
        return hotelRatings;
    }

    public void setHotelRatings(int hotelRatings) {
        this.hotelRatings = hotelRatings;
    }

    public int getRegularCustomer() {
        return regularCustomer;
    }

    public void setRegularCustomer(int regularCustomer) {
        this.regularCustomer = regularCustomer;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "HotelDetails{" +
                "hotelName='" + hotelName + '\'' +
                ", weekdaysRates=" + weekdaysRates +
                ", rewardCustomerWeek=" + rewardCustomerWeek +
                ", weekenddayRates=" + weekenddayRates +
                ", rewardCustomerWeekend=" + rewardCustomerWeekend +
                ", hotelRatings=" + hotelRatings +
                ", regularCustomer=" + regularCustomer +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
