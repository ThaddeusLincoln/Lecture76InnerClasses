package com.turing.jdev.innerclasses;

public class Main {

	public static void main(String[] args){
		
		// 1. Sample of using a non-static nested class, or Inner class which is private now
		Gearbox mcLaren = new Gearbox(6);
		
		/*mcLaren.addGear(1, 5.3);
		mcLaren.addGear(2, 10.6);
		mcLaren.addGear(3, 15.9);*/
		
		
		mcLaren.operateClutch(true);
		mcLaren.changeGear(1);
		mcLaren.operateClutch(false);
		System.out.println(mcLaren.wheelSpeed(1000));
		mcLaren.changeGear(2);
		System.out.println(mcLaren.wheelSpeed(3000));
		

	}
}
