package com.Naveen;

import java.io.Serializable;

public class Vehicle implements Serializable {

	int VehicleNo;
	String VehicleName;
	
	
	public Vehicle(int vehicleNo, String vehicleName) {
		super();
		VehicleNo = vehicleNo;
		VehicleName = vehicleName;
	}


	@Override
	public String toString() {
		return "Vehicle [VehicleNo=" + VehicleNo + ", VehicleName=" + VehicleName + "]";
	}
	
	
	
	
}
