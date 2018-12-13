package assessmentflightsystem;

/**
 * @author 40008729
 *
 */

public class PassengerPlane extends Aircraft {

	// Instance variable(s).
	private int passengerNumber;

	/// Default constructor.
	public PassengerPlane() {

	}

	// Constructor with all arguments.
	public PassengerPlane(String aircraftID, String carrierCode, int crewNumber, String destination, String origin,
			int passengerNumber) {
		super(aircraftID, carrierCode, crewNumber, destination, origin);
		setPassengerNumber(passengerNumber); 
	}

	// Getters and setters.
	/**
	 * @return the passengerNumber
	 */
	public int getPassengerNumber() {
		return passengerNumber;
	}

	/**
	 * @param passengerNumber the passengerNumber to set 
	 * Contains validation - an if statement that checks that 
	 * the passenger number is within acceptable boundaries.
	 */
	public void setPassengerNumber(int passengerNumber) {
		if (passengerNumber < 0 || passengerNumber > 350) {
			System.out.println("PASSENGER NUMBER OUTSIDE RANGE");
			this.passengerNumber = -1;
		} else {
			this.passengerNumber = passengerNumber;

		}

	}

	/*
	 * (non-Javadoc)
	 *  
	 * @see p240008729.Aircraft#displayAll()
	 */
	@Override
	public void displayAll() {
		super.displayAll();
		System.out.println("Passengers\t:    " + this.passengerNumber + "\n");

	}

}
