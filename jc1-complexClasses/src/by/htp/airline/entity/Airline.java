package by.htp.airline.entity;

public class Airline {
	private String destination;
	private int num;
	private String planeType;
	private int departureTime;
	private String days;

	public Airline() {
		this.destination = "default destination point";
		this.num = 0;
		this.planeType = "default plane type";
		this.departureTime = 24;
		this.days = "Mo, Tu, We, Th, Fr, St, Sn";
	}
	
	public Airline(String destination, int num, String planeType, int leavingHour, String activeWeekDays) {
		this.destination = destination;
		this.num = num;
		this.planeType = planeType;
		this.departureTime = leavingHour;
		this.days = activeWeekDays;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getPlaneType() {
		return planeType;
	}

	public void setPlaneType(String planeType) {
		this.planeType = planeType;
	}

	public int getLeavingHour() {
		return departureTime;
	}

	public void setLeavingHour(int leavingHour) {
		this.departureTime = leavingHour;
	}

	public String getActiveWeekDays() {
		return days;
	}

	public void setActiveWeekDays(String activeWeekDays) {
		this.days = activeWeekDays;
	}

	@Override
	public String toString() {
		return "Destination: " + destination + "\t|\tNumber: " + num + "\t|\tplaneType: " + planeType + "\t|\tDeparture: "
				+ departureTime + "\t|\tDays: " + days;
	}
}
