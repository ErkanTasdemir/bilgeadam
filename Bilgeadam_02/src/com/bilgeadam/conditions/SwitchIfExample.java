package com.bilgeadam.conditions;

public class SwitchIfExample {

	public static void main(String[] args) {

		int Number = 33;

		switch (Number) {
		case 1:
			System.out.println("Number : 1");
			break;
		case 2:
			System.out.println("Number : 2");
			break;
		case 3:
			System.out.println("Number : 3");
			break;
		case 4:
			System.out.println("Number : 4 ");
			break;
		case 5:
			System.out.println("Number : 5");
			break;
		default:
			System.out.println("Not Found");
			break;
		}

		if (Number == 1) {
			System.out.println("Number : 1");
		} else if (Number == 2) {
			System.out.println("Number : 2");
		} else if (Number == 3) {
			System.out.println("Number : 3");
		} else if (Number == 4) {
			System.out.println("Number : 4");
		} else if (Number == 5) {
			System.out.println("Number : 5");
		}else {
			System.out.println("Not Found");
		}

	}

}
