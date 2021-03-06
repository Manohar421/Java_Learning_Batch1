package oops.inheritance;

public class Vehicle {
	private String VehicleType;
	private int numOfWheels;
	
	public Vehicle() {
		super();
		System.out.println("Vehicle constructor called!!!");
	}

	public Vehicle(String vehicleType, int numOfWheels) {
		super();
		VehicleType = vehicleType;
		this.numOfWheels = numOfWheels;
	}
	
	public Vehicle(String vehicleType) {
		super();
		VehicleType = vehicleType;
	}
	
	public Vehicle(int numOfWheels) {
		super();
		this.numOfWheels = numOfWheels;
	}

	public String getVehicleType() {
		return VehicleType;
	}

	public void setVehicleType(String vehicleType) {
		VehicleType = vehicleType;
	}

	public int getNumOfWheels() {
		return numOfWheels;
	}

	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}

	@Override
	public String toString() {
		return "Vehicle [VehicleType=" + VehicleType + ", numOfWheels=" + numOfWheels + "]";
	}
	
	public void runMe() {
		System.out.println("I will run with "+ getNumOfWheels() + " wheels");
	}

}
