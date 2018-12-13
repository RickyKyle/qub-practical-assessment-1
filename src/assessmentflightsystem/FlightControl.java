/**
 * 
 */
package assessmentflightsystem;

/**
 * @author Richard Kyle 40008729
 *
 */
public class FlightControl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Instantiate objects.
		PassengerPlane passenger1 = new PassengerPlane("1001", "BA", 9, "LAX", "BFS", 350);
		PassengerPlane passenger2 = new PassengerPlane("1002", "AER", 4, "LHR", "BFS", 121);
		PassengerPlane passenger3 = new PassengerPlane("1003", "EZY", 3, "GLA", "BFS", 25);
		CargoPlane cargo1 = new CargoPlane("1009", "AER", 2, "EWR", "BFS", 1267);
		CargoPlane cargo2 = new CargoPlane("1021", "BA", 4, "LHR", "BFS", 358);

		// Create array of objects of type aircraft.
		Aircraft[] aircraftArray = { passenger1, passenger2, passenger3, cargo1, cargo2 };
		// Create an array of objects of type PassengerPlane.
		PassengerPlane[] passengerPlaneArray = { passenger1, passenger2, passenger3 };

		// Display average crew per flight.
		averageCrewInAllFlights(aircraftArray);

		// Flights to LHR.
		flightsToLHR(aircraftArray);

		// Flights by Aer Lingus.
		flightsByCarrier(aircraftArray, "Aer Lingus");

		// Total passengers to fly.
		totalPassengersToFly(passengerPlaneArray);

	}

	/*
	 * Uses an enhanced for loop to loop through the array to sum the total number
	 * of crew members, then divides the crew number by the length of the array
	 * (total aircraft) to determine the average crew number per flight. Could
	 * be modified to not require the average variable but output straight to 
	 * System.out, but this method was used for code readability. 
	 */
	public static void averageCrewInAllFlights(Aircraft[] aircraftArray) {
		
		// Declare and initialise variables. 
		int total = 0;
		double average = 0;
		
		// Loop and sum through the array. 
		for (Aircraft aircraft : aircraftArray) {
			total += aircraft.getCrewNumber();
		}

		// Calculate average.
		average = (double) total / aircraftArray.length;

		// Output result to 2 decimal places. 
		System.out.printf("Average crew per flight: %.2f\n", average);

	}

	/*
	 * Uses an enhanced for loop combined with an if statement to determine which
	 * flights have a destination of "LHR".
	 */
	public static void flightsToLHR(Aircraft[] aircraftArray) {

		System.out.println("\nFlights to LHR:");
		
		for (Aircraft aircraft : aircraftArray) {
			if (aircraft.getDestination().equalsIgnoreCase("LHR")) {
				System.out.println(aircraft.getAircraftID());
			}
		}

	}

	/*
	 * When given the string "Aer Lingus" outputs all flights with carrier code
	 * "AER".  Can be modified to work with other strings e.g. "British Airways"
	 *  or "EasyJet" through the use of a switch statement or additional if-
	 *  statements. 
	 */
	public static void flightsByCarrier(Aircraft[] aircraftArray, String carrier) {
		if (carrier.equalsIgnoreCase("Aer Lingus")) {
			System.out.println("\nFlights by Aer Lingus:");

			for (Aircraft aircraft : aircraftArray) {
				if (aircraft.getCarrierCode().equalsIgnoreCase("AER")) {
					System.out.println(aircraft.getAircraftID());
				}
			}

		} else {
			System.out.println("Invalid input.  Please enter \"Aer Lingus\"");
		}
	}

	/*
	 * Uses an enhanced FOR loop to iterate through the passengerPlaneArray and sum
	 * the total number of passengers flying. Stores in a totalPassengers variable
	 * and outputs to screeen.
	 */
	public static void totalPassengersToFly(PassengerPlane[] passengerPlaneArray) {
		
		// Declare and initialise variable. 
		int totalPassengers = 0;

		// Iterate and sum through array.
		for (PassengerPlane aircraft : passengerPlaneArray) {
			totalPassengers += aircraft.getPassengerNumber();
		}
		
		// Output result. 
		System.out.println("\nTotal passengers due to fly: " + totalPassengers);

	}
}
