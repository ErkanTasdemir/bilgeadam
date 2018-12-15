package com.bilgeadam.conditions;

public class WhileExample {

	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		String asd =" ";
		
		while (a <10) {
			//System.out.println("Value is smaller then 10");
			System.out.println(asd + "*");
			asd +=" ";
			a++;	
		}
		
		do {
			System.out.println("In the do while");
			System.out.println(a + "value is smaller then 10");
			
		} while (a < 10);

	}

}
