package com.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class DeserializeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(FileInputStream fi = new FileInputStream("Collegelist.txt")){
			
			ObjectInputStream oi = new ObjectInputStream(fi);
			
			College[] col = (College[])oi.readObject();
			ArrayList<College> collist = (ArrayList<College>)oi.readObject();
			
			for(College coll: col ) {
				System.out.println(coll);
			}
			System.out.println();
			for (College coll:collist) {
				System.out.println(coll);
			}
			
			int val = oi.readInt();
			System.out.println("-----------------");
			for(int i=0;i<val;i++) {
				College col2 =  (College)oi.readObject();
				System.out.println(col2);
			}
			
			
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
		
		System.out.println("Object has been deserialised........");
	}

}
