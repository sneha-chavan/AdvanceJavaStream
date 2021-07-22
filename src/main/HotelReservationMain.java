package main;

public class HotelReservationMain {
	private static Hotel lakewood,bridgewood,ridgewood;
	
	//adding rating of hotel
	public static void addRate(Hotel hotel, int rating) {
		hotel.setrating(rating);
	}

	public static void main(String[] args) {
		lakewood = new Hotel("LAKEWOOD",110,80);
		bridgewood = new Hotel("BRIDGEWOOD",160,110);
		ridgewood = new Hotel("RIDGEWOOD",220,100);

		//adding rating for hotels
		addRate(lakewood, 3);
		addRate(bridgewood, 4);
		addRate(ridgewood, 5);
	}

}
