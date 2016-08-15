package com.turing.jdev.innerclasses;

import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);
	private static Button btnPrint = new Button("Print");
	
	public static void main(String[] args){
		
		// 1. Sample of using a non-static nested class, or Inner class which is private now
		/*Gearbox mcLaren = new Gearbox(6);
		
		mcLaren.operateClutch(true);
		mcLaren.changeGear(1);
		mcLaren.operateClutch(false);
		System.out.println(mcLaren.wheelSpeed(1000));
		mcLaren.changeGear(2);
		System.out.println(mcLaren.wheelSpeed(3000));*/
		
		
		// 2. Sample on Local-Classes (tied to a specific block of code)
		class ClickListener implements Button.OnClickListener{
			
			public ClickListener(){
				System.out.println("I've been attached");
			}

			@Override
			public void onClick(String title) {
				System.out.println(title + " was clicked");
				
			}
		}
		
		// Assuming we have some kind of GUI, like it could be in Android, ClickListener would actually
		// respond when a click is make in the object
		btnPrint.setOnClickListener(new ClickListener());
		listen();
		
	}
	
	/**
	 * As we're not in a GUI, we're gonna simulate the click by input from the keyboard
	 */
	private static void listen(){
		boolean quit = false;
		while(!quit){
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			switch (choice) {
			case 0:
				quit = true;
				break;

			case 1:
				btnPrint.onClick();
				break;
			}
		}
	}
	
	
}
