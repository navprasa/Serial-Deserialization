package com.Naveen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Reading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Reading objects...");
		try(FileInputStream fi = new FileInputStream("Vehicle.txt")){
			
			ObjectInputStream oi = new ObjectInputStream(fi);
			
			Vehicle vehicle[] = (Vehicle[])oi.readObject();
			ArrayList<Vehicle> vehicleList =(ArrayList<Vehicle>)oi.readObject();
			for (Vehicle myvehicles: vehicle) {
				System.out.println(myvehicles);
			}
			System.out.println();
			for (Vehicle myvehicles: vehicleList) {
				System.out.println(myvehicles);
			}
			
			oi.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
	}

}
