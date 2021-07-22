package main;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class HotelReservationMain {
	private static Hotel lakewood,bridgewood,ridgewood;
	
	// Adding rating of hotel
	private static void addRate(Hotel hotel, int rating) {
		hotel.setrating(rating);
	}
	
	// Find rate for hotel in  given range Date
	private static int totalRateInGivenDateRange(LocalDate startDate, LocalDate endDate, Hotel hotel) {
		int totalRate=0;
		LocalDate date = startDate;
		while(true) {
			int compareValue = date.compareTo(endDate);
			if (compareValue < 0) {
	          boolean isWeekday = checkDateIsWeekday(date);
	          if(isWeekday)
	        	  totalRate += hotel.getRegularWeekday();
	          else
	        	  totalRate += hotel.getRegularWeekEnd();
	        }
			else {
				return totalRate;
			}
			date = date.plusDays(1);
		}
	}
	
	// Check if date is for weekday or weekend
	private static boolean checkDateIsWeekday(LocalDate date) {
//		 LocalDate localDate = LocalDate.of(year, month, date);
	      DayOfWeek day = DayOfWeek.of(date.get(ChronoField.DAY_OF_WEEK));
	      switch (day) {
	         case SATURDAY:
	         case SUNDAY:	        	 
	            return false;
	         default:
	            return true;
	      }
	}

	public static void main(String[] args) {
		lakewood = new Hotel("LAKEWOOD",110,80);
		bridgewood = new Hotel("BRIDGEWOOD",160,110);
		ridgewood = new Hotel("RIDGEWOOD",220,100);

		//adding rating for hotels
		addRate(lakewood, 3);
		addRate(bridgewood, 4);
		addRate(ridgewood, 5);
		
		//finding cheapest hotel in given date range
		LocalDate startDate = LocalDate.of(2020, 9, 10);
		LocalDate endDate = LocalDate.of(2020, 9, 15);
		int lakewoodTotalRates = totalRateInGivenDateRange(startDate, endDate, lakewood);
		int bridgeTotalRates = totalRateInGivenDateRange(startDate, endDate, bridgewood);
		int ridgeTotalRates = totalRateInGivenDateRange(startDate, endDate, ridgewood);
		//System.out.println("total rates in \nlakewood: "+ lakewoodTotalRates+"\nbridgewood: "+bridgeTotalRates+"\nridgewood: "+ridgeTotalRates);
		Hotel cheapestHotel = lakewoodTotalRates < bridgeTotalRates ? 
								(lakewoodTotalRates < ridgeTotalRates ?lakewood: ridgewood)
								:(bridgeTotalRates < ridgeTotalRates ? bridgewood : ridgewood);
		int cheapestHotelTotalCost =lakewoodTotalRates < bridgeTotalRates ? 
						(lakewoodTotalRates < ridgeTotalRates ?lakewoodTotalRates: ridgeTotalRates)
						:(bridgeTotalRates < ridgeTotalRates ? bridgeTotalRates : ridgeTotalRates);
		System.out.println("Cheapest Hotel: "+ cheapestHotel.getHotelName()+"\t its total cost: "+cheapestHotelTotalCost);
		
		
	}

}
