package com.bilgeadam.conditions;
import java.util.Scanner;

/*
 * ctrl + shift + F = projeyi üzenler
 * 
 * */
public class ProductExample {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int x, y, z, result;

		System.out.println("Please enter the first number :");

		x = input.nextInt();

		System.out.println("Please enter the second number :");

		y = input.nextInt();

		System.out.println("Please enter the third number :");

		z = input.nextInt();

		result = x + y + z;

		System.out.println("Product is :" + result);
	}

}
