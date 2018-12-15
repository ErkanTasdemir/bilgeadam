package com.bilgeadam.conditions;


import java.util.Locale;
import java.util.Scanner;

public class BmiExample {

	public static void main(String[] args) {

		System.out.println("Calculate user mass index");

		double weight, height, result;

		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.ENGLISH); //girilen deðerin noktalý olunca hata vermemesini saðlýyýr.

		System.out.println("Please enter your weight : ");

		weight = input.nextDouble();

		System.out.println("Height : ");

		height = input.nextDouble();

		result = weight / (height * height);

		if (result < 18.5) {
			System.out.println("You are underweight...");
		} else if (18.5 <= result && result < 24.9) {
			System.out.println("You are normal...");
		} else if (25.0 <= result && result < 29.9) {
			System.out.println("You are overweight...");
		} else if (30.0 <= result) {
			System.out.println("You are Very overweight...");
		}
	}
}
