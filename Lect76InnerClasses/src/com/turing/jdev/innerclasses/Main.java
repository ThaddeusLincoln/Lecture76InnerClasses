package com.turing.jdev.innerclasses;

public class Main {

	public static void main(String[] args){
		
		// 1. Sample of using a non-static nested class, or Inner class
		Gearbox mcLaren = new Gearbox(6);
		Gearbox.Gear first = mcLaren.new Gear(1, 12.3);
		System.out.println(first.driverSpeed(100));

	}
}
