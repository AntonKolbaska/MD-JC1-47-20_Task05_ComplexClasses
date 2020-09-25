package by.htp.airline.main;
import java.util.List;

import by.htp.airline.entity.Airline;
import by.htp.airline.entity.Airport;
public class AView {
	public void printAll(String message, List<Airline> airlines) {
		System.out.println(message);

		for (int i = 0; i < airlines.size(); i++) {
			Airline airline = airlines.get(i);			
			System.out.println(airline.toString());
		}
	}
	
	public void printAll(String message, Airport airport) {
		System.out.println(message);

		List<Airline> airlines = airport.getAirlines();
		for (int i = 0; i < airlines.size(); i++) {
			Airline airline = airlines.get(i);			
			System.out.println(airline.toString());
		}
	}
}
