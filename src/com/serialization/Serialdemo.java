package com.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class Serialdemo {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		College[] col = {new College(71,"Naveen", "ECE",  "C Block",  7500), new College(70,"Monika", "CSE",  "A Block",  7500),new College(70,"Karthik", "ME",  "M Block",  7500)};
		ArrayList<College> college= new ArrayList(Arrays.asList(col));
		try(FileOutputStream FO = new FileOutputStream("Collegelist.txt")){
			
			ObjectOutputStream os = new ObjectOutputStream(FO);
			os.writeObject(col);
			os.writeObject(college);
			
			os.writeInt(college.size());
			for(College colist: college){
				os.writeObject(colist);
			}
			
			os.close();FO.close();
			
			System.out.println("Data has been serialized.........");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
	}

}
