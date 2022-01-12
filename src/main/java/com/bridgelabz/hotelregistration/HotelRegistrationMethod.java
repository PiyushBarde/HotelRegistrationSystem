package com.bridgelabz.hotelregistration;

public class HotelRegistrationMethod {
	HotelRegistrationDetails Lakewood = new HotelRegistrationDetails();
	HotelRegistrationDetails Bridgewood = new HotelRegistrationDetails();
	HotelRegistrationDetails Ridgewood = new HotelRegistrationDetails();
	
	public void addHotel() {
		Lakewood.setHotelName("Lakewood");
		Lakewood.setHotelRatesForRegularCustomerOnWeekdays(110);
		Lakewood.setHotelRatesForRegularCustomerOnWeekend(90);
		
		Bridgewood.setHotelName("Bridgewood");
		Bridgewood.setHotelRatesForRegularCustomerOnWeekdays(160);
		Bridgewood.setHotelRatesForRegularCustomerOnWeekend(60);
		
		Ridgewood.setHotelName("Ridgewood");
		Ridgewood.setHotelRatesForRegularCustomerOnWeekdays(220);
		Ridgewood.setHotelRatesForRegularCustomerOnWeekend(150);
		
		System.out.println(Lakewood);
		System.out.println(Bridgewood);
		System.out.println(Ridgewood);
	}
}
