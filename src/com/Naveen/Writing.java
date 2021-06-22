package com.Naveen;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class Writing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Writing Objects.......");
		Vehicle vehicle[] = {new Vehicle(500,"Ford"),new Vehicle(501,"Chevrolet"), new Vehicle(5012,"Yamaha")};
		ArrayList<Vehicle> vehiclelist= new ArrayList<Vehicle>(Arrays.asList(vehicle));
		try (FileOutputStream fo = new FileOutputStream("Vehicle.txt")) {
			
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			
			oo.writeObject(vehicle);
			oo.writeObject(vehiclelist);
			System.out.println(vehicle);
			System.out.println();
			System.out.println(vehiclelist);
			
			oo.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
