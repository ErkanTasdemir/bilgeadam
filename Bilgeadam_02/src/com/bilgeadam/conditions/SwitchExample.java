package com.bilgeadam.conditions;


public class SwitchExample {

	public static void main(String[] args) {

		String name = "Erkan";
		
		switch (name) {
		case "Erkan":
			System.out.println("Welcome " + name);
			break;
		case "Mehmet":
			System.out.println("Welcome " + name);
			break;
		case "Koray":
			System.out.println("Welcome " + name);
			break;
		default:
			System.out.println("Welcome nobody");
			break;
		}
		
		System.out.println("***************************");
		
		char expChar = 'A';
		
		switch (expChar) {
		case 'A':
			System.out.println("Char is A");
			break;
		case 'B':
			System.out.println("Char is B,");
			break;

		default:
			break;
		}

	}

}
