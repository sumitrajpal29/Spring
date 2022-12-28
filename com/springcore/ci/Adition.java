package com.springcore.ci;

public class Adition {
	private int a;
	private int b;
	
	public Adition(double a, double b) {
		this.a=(int) a;
		this.b=(int) b;
		
		System.out.println("Adition \"double\" \"double\"");
	}
	public Adition(int a, int b) {
		this.a=a;
		this.b=b;
		
		System.out.println("Adition \"int\" \"int\"");
	}
	
//	public Adition(String a, String b) {
//		this.a=Integer.parseInt(a);//
//		this.b=Integer.parseInt(b);
//		
//		System.out.println("Adition \"String\" \"String\"");
//	}
	
	
	@Override
	public String toString() {
		return "Adition "+a+"+"+b+" = "+ (a+b);
	}
}
