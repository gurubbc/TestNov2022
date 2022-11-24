package com.ofss;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello world");
		
		MyCalculator mc=new MyCalculator();
		System.out.println("The sum is "+mc.sum(10, 15));

	}

}
