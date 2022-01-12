package com.bridgelabz.hotelregistration;

import org.junit.Assert;
import org.junit.Test;

public class HotelRegistrationJunitTest {
@Test
	public void givenHotelInformation_WhenCorrect_ShouldReturnTrue() {
	HotelRegistrationMethod hotelRegistrationMethod = new HotelRegistrationMethod();
	int numberOfHotels = hotelRegistrationMethod.NumberOfHotellist();
	Assert.assertEquals(3, numberOfHotels);
	
	}
}

