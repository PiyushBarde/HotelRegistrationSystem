package com.bridgelabz.hotelregistration;

public class HotelRegistrationDetails {
	private String hotelName;
	private Integer hotelRatesForRegularCustomerOnWeekdays;
	private Integer hotelRatesForRegularCustomerOnWeekend;
	private Integer hotelRating;
	public Integer getHotelRating() {
		return hotelRating;
	}
	public void setHotelRating(Integer hotelRating) {
		this.hotelRating = hotelRating;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName)
	{
		this.hotelName = hotelName;
	}
	public Integer getHotelRatesForRegularCustomerOnWeekdays() 
	{
		return hotelRatesForRegularCustomerOnWeekdays;
	}
	public void setHotelRatesForRegularCustomerOnWeekdays(Integer hotelRatesForRegularCustomerOnWeekdays)
	{
		this.hotelRatesForRegularCustomerOnWeekdays = hotelRatesForRegularCustomerOnWeekdays;
	}
	public Integer getHotelRatesForRegularCustomerOnWeekend()
	{
		return hotelRatesForRegularCustomerOnWeekend;
	}
	public void setHotelRatesForRegularCustomerOnWeekend(Integer hotelRatesForRegularCustomerOnWeekend)
	{
		this.hotelRatesForRegularCustomerOnWeekend = hotelRatesForRegularCustomerOnWeekend;
	}
	@Override
	public String toString() {
		return " hotelName=" + hotelName + ", \nhotel Rates For Regular Customer OnWeekdays= "
				+ hotelRatesForRegularCustomerOnWeekdays + ", \nhotel Rates For Regular Customer On Weekend="
				+ hotelRatesForRegularCustomerOnWeekend + ", \nhotel Rating= " + hotelRating;
	}
}
