package by.htp.airline.main;

import by.htp.airline.entity.Airline;
import by.htp.airline.entity.Airport;
import by.htp.airline.logic.ALogic;

public class Main {

	public static void main(String[] args) {
		Airport airp = new Airport();
		ALogic logic = new ALogic();
		AView view = new AView();
		
		airp.add(new Airline());
		airp.add(new Airline("Koenigsberg", 45, "Maizeplane", 1, "Mo, We, Fr"));
		airp.add(new Airline("Walhalla", 123, "JumboJet", 23, "Mo, Tu, We, Th, Fr, St, Sn"));
		
		view.printAll("Full list:", airp);
		
		view.printAll("\nto Walhalla:", logic.airlinesByDestination(airp, "Walhalla"));
		view.printAll("\nThursday: ", logic.airlinesByWeekDay(airp, "Th"));
		view.printAll("\nWednesday, after noon", logic.airlinesDayHour(airp, "We", 12));

	}

}
