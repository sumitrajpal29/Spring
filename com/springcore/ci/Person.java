package com.springcore.ci;

import java.util.List;

public class Person {
	private String name;
	private int persionId;
	private Certi certi;
	private List<String> skills;
	
	public Person(String name, int personId, Certi certi, List<String> skills) {
		this.name=name;
		this.persionId=personId;
		this.certi=certi;
		this.skills=skills;
	}

	@Override
	public String toString() {
		return this.name+": "+this.persionId+"{"+this.certi+"} "+this.skills;
	} 
}
