/**
 * 
 */
package assessmentflightsystem;

/**
 * @author 40008729
 *
 */
public class Aircraft {

	// Instance variables.
	private String aircraftID;
	private int crewNumber;
	private String origin;
	private String destination;
	private String carrierCode;

	// Default constructor.
	public Aircraft() {

	}

	// Constructor with all arguments.
	public Aircraft(String aircraftID, String carrierCode, int crewNumber, String destination, String origin) {
		this.aircraftID = aircraftID;
		setCarrierCode(carrierCode); 
		this.crewNumber = crewNumber;
		this.destination = destination;
		this.origin = origin;

	}

	// Getters and setters.
	/**
	 * @return the aircraftID
	 */
	public String getAircraftID() {
		return aircraftID;
	}

	/**
	 * @param aircraftID the aircraftID to set
	 */
	public void setAircraftID(String aircraftID) {
		this.aircraftID = aircraftID;
	}

	/**
	 * @return the crewNumber
	 */
	public int getCrewNumber() {
		return crewNumber;
	}

	/**
	 * @param crewNumber the crewNumber to set
	 */
	public void setCrewNumber(int crewNumber) {
		this.crewNumber = crewNumber;
	}

	/**
	 * @return the origin
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * @param origin the origin to set
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}

	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}

	/**
	 * @return the carrierCode
	 */
	public String getCarrierCode() {
		return carrierCode;
	}

	/**
	 * @param carrierCode the carrierCode to set
	 * Contains validation in the from of a switch statement
	 * to ensure that only the accepted carrier codes 
	 * (BA, AER, EZY) are accepted.  Defaults to 
	 * "Unknown". 
	 */
	public void setCarrierCode(String carrierCode) {

		switch (carrierCode) {
			case "BA":
				this.carrierCode = carrierCode;
				break;
			case "AER":
				this.carrierCode = carrierCode;
				break;
			case "EZY":
				this.carrierCode = carrierCode;
				break;
			default:
				this.carrierCode = "UNKNOWN";

		}

	}

	// Superclass display all. 
	public void displayAll() {
		System.out.println(getClass().getSimpleName() + "______________________");
		System.out.println("AircraftID\t:    " + this.aircraftID);
		System.out.println("Carrier Code\t:    " + this.carrierCode);
		System.out.println("Crew Number\t:    " + this.crewNumber);
		System.out.println("Destination\t:    " + this.destination);
		System.out.println("Origin\t        :    " + this.origin);

	}

}
