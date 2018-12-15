package com.bilgeadam.conditions;

public class TernaryOperators {

	public static void main(String[] args) {

		
		String name ="Andy";
		String password = "1234";
		
		String result = (password == "1234") ? ("Welcome " + name):("Your password is wrong");
		System.out.println(result);

	}

}
