package com.bridgelabz.hotelregistration;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.time.DayOfWeek;

public class HotelRegistrationMethod 
{
	static HotelRegistrationDetails Lakewood = new HotelRegistrationDetails();
	static HotelRegistrationDetails Bridgewood = new HotelRegistrationDetails();
	static HotelRegistrationDetails Ridgewood = new HotelRegistrationDetails();
	static Scanner sc = new Scanner(System.in);
	static String cheapestHotel;
	static String bestRatingHotel;
	int totalForLakewood=0;
	int totalForBridgewood=0;
	int totalForRidgewood=0;
	
	public void cheapHotelForInputDates()
	{
		System.out.println("Enter first day of hotel Reservation (YYYY-MM-DD) : ");
		String startDateString = sc.nextLine();
		System.out.println("Enter last day of hotel Reservation (YYYY-MM-DD) : ");
		String endDateString = sc.nextLine();
	
		LocalDate startDate = LocalDate.parse(startDateString);
        LocalDate endtDate = LocalDate.parse(endDateString);
	 
	    // Predicate : Is a given date is a weekday
	    Predicate<LocalDate> isWeekend = date -> date.getDayOfWeek() == DayOfWeek.SATURDAY
	            || date.getDayOfWeek() == DayOfWeek.SUNDAY;
	 
	    // Iterate over stream of all dates and check each day against any weekday
	    List<LocalDate> businessDays = startDate.datesUntil(endtDate)
	            .filter(isWeekend.negate())
	            .collect(Collectors.toList());
	    List<LocalDate> allDays = startDate.datesUntil(endtDate)
	            .collect(Collectors.toList());
	    
	    int weekendDays = allDays.size() + 1 - businessDays.size();
	  
	    int costofLakewood=totalValue(90,110,"Lakewood",weekendDays,businessDays.size());
	    int costofBridgewood=totalValue(60,160,"Bridgewood",weekendDays,businessDays.size());
	    int costofRidgewood=totalValue(150,220,"Ridgewood",weekendDays,businessDays.size());
	    
	    if( costofLakewood<costofBridgewood && costofLakewood<costofRidgewood)
	    {
	    	System.out.println("Cheapest Hotel is Lakewood with " + costofLakewood + "$");
	    	cheapestHotel="Lakewood";
	    }
	    else if( costofBridgewood<costofLakewood && costofBridgewood<costofRidgewood)
	    {
	    	System.out.println("Cheapest Hotel is Bridgewood with " + costofBridgewood + "$");
	    	cheapestHotel="Bridgewood";
	    }
	    else
	    {
	    	System.out.println("Cheapest Hotel is Ridgewood with " + costofRidgewood + "$");
	    	cheapestHotel="Ridgewood";
	    }
	    
	    if(Lakewood.getHotelRating()>Bridgewood.getHotelRating() && Lakewood.getHotelRating()>Ridgewood.getHotelRating()){
	    	System.out.println("Hotel Lakewood has bet ratings i.e. " + Lakewood.getHotelRating());
	    	bestRatingHotel="Lakewood";
	    }
	    else if(Bridgewood.getHotelRating()>Lakewood.getHotelRating() && Bridgewood.getHotelRating()>Ridgewood.getHotelRating()){
	    	System.out.println("Hotel Bridgewood has bet ratings i.e. " + Bridgewood.getHotelRating());
	    	bestRatingHotel="Bridgewood";
	    }
	    else
	    {
	    	System.out.println("Hotel Ridgewood has bet ratings i.e. " + Ridgewood.getHotelRating());
	    	bestRatingHotel="Ridgewood";
	    }
	    if(cheapestHotel=="Lakewood" && bestRatingHotel=="Ridgewood") {
	    	System.out.println("the cheapest best rated hotel Hotel for given Date Range is Bridgewood with total cost " + costofBridgewood + " $ and rating of" + Bridgewood.getHotelRating());
	    }
	    
	}
	
	public static int totalValue(int rateOnWeekend, int rateOnWeekdays ,String hotelName ,int daysOfWeekend, int daysOfWeek) 
	{
		int totalCost = (rateOnWeekend * daysOfWeekend) + (rateOnWeekdays * daysOfWeek);
		System.out.println("total cost of reservation of " + hotelName + " hotel = " +  totalCost + " $");
		return totalCost;
	}
	
	
	
	public void addHotel() {
		Lakewood.setHotelName("Lakewood");
		Lakewood.setHotelRatesForRegularCustomerOnWeekdays(110);
		Lakewood.setHotelRatesForRegularCustomerOnWeekend(90);
		Lakewood.setHotelRating(3);
		
		Bridgewood.setHotelName("Bridgewood");
		Bridgewood.setHotelRatesForRegularCustomerOnWeekdays(160);
		Bridgewood.setHotelRatesForRegularCustomerOnWeekend(60);
		Bridgewood.setHotelRating(4);

		
		Ridgewood.setHotelName("Ridgewood");
		Ridgewood.setHotelRatesForRegularCustomerOnWeekdays(220);
		Ridgewood.setHotelRatesForRegularCustomerOnWeekend(150);
		Bridgewood.setHotelRating(5);

		System.out.println("---------------------------information about Hotels---------------------------"
				+ "\n___________________________________________________________________________");
		System.out.println(Lakewood);
		System.out.println(Bridgewood);
		System.out.println(Ridgewood);
		System.out.println("___________________________________________________________________________");
	}
	
	public int NumberOfHotellist() {
		return 3;
	}
}
