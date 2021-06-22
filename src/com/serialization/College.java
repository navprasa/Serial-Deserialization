package com.serialization;



public class College extends Student  {

	String Department, Block;
	int fees;
	public College(int id, String name, String department, String block, int fees) {
		super(id, name);
		Department = department;
		Block = block;
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "College [Department=" + Department + ", Block=" + Block + ", fees=" + fees + ", id=" + id + ", name="
				+ name + "]";
	}
	
	
	
	
	
	
	
}
