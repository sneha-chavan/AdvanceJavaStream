package main;

public class Hotel {
	private int regularWeekEnd;
	private int regularWeekday;
	private int rewardWeekday;
	private int rewardWeekEnd;
	private String hotelName;
	private int rating;
	
	public Hotel( String hotelName, int regularWeekEnd, int regularWeekday) {
		super();
		this.regularWeekEnd = regularWeekEnd;
		this.regularWeekday = regularWeekday;
		this.hotelName = hotelName;
	}
	
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public int getrating() {
		return rating;
	}
	public void setrating(int rating) {
		this.rating = rating;
	}

	public int getRegularWeekEnd() {
		return regularWeekEnd;
	}

	public void setRegularWeekEnd(int regularWeekEnd) {
		this.regularWeekEnd = regularWeekEnd;
	}

	public int getRegularWeekday() {
		return regularWeekday;
	}

	public void setRegularWeekday(int regularWeekday) {
		this.regularWeekday = regularWeekday;
	}

	public int getRewardWeekday() {
		return rewardWeekday;
	}

	public void setRewardWeekday(int rewardWeekday) {
		this.rewardWeekday = rewardWeekday;
	}

	public int getRewardWeekEnd() {
		return rewardWeekEnd;
	}

	public void setRewardWeekEnd(int rewardWeekEnd) {
		this.rewardWeekEnd = rewardWeekEnd;
	}
	
	
	
	
}
