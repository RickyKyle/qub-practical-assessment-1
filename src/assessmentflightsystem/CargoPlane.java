/**
 * 
 */
package assessmentflightsystem;

/**
 * @author 40008729
 *
 */
public class CargoPlane extends Aircraft {

	// Instance variable(s).
	private int cargoLoadWeight;

	// Default constructor.
	public CargoPlane() {

	}

	// Constructor with all arguments.
	public CargoPlane(String aircraftID, String carrierCode, int crewNumber, String destination, String origin,
			int cargoLoadWeight) {
		super(aircraftID, carrierCode, crewNumber, destination, origin);
		setCargoLoadWeight(cargoLoadWeight); 
	}

	// Getters and setters.
	/**
	 * @return the cargoLoadWeight
	 */
	public int getCargoLoadWeight() {
		return cargoLoadWeight;
	}

	/**
	 * @param cargoLoadWeight the cargoLoadWeight to set 
	 * Contains validation (if statement) to ensure that 
	 * the cargo load weight is within acceptable boundaries.
	 */
	public void setCargoLoadWeight(int cargoLoadWeight) {
		if (cargoLoadWeight < 0 || cargoLoadWeight > 5000) {
			System.out.println("CARGO TOO HEAVY");
			this.cargoLoadWeight = -1;
		} else {
			this.cargoLoadWeight = cargoLoadWeight;
		}

	}

	// Display all override.
	/*
	 * (non-Javadoc)
	 * 
	 * @see p240008729.Aircraft#displayAll()
	 */
	@Override
	public void displayAll() {
		super.displayAll();
		System.out.println("Cargo Weight\t:    " + this.cargoLoadWeight + "\n");
	}

}
