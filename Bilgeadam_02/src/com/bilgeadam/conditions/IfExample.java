package com.bilgeadam.conditions;

public class IfExample {

	public static void main(String[] args) {

		int a = 5;
		String x ="bilgeadam";

		if (a == 5) {
			
			if (x =="bilgeadam") {
				System.out.println("String is true");
			}else {
				System.out.println("String is false");
			}
			System.out.println("Result is 5");

		} else if (a == 7) {
			System.out.println("Result is 7");
		} else if (a == 9) {
			System.out.println("Result is 9");
		}else {
			System.out.println("Result is NOT 5,7 or 9");
		}
	}

}
