package com.bilgeadam.conditions;

public class LogicalOperators {

	public static void main(String[] args) {

		System.out.println("true && true : " +(true && true));
		System.out.println("true && false : " +(true && false));
		System.out.println("false && true : " +(false && true));
		System.out.println("false && false : " +(false && false));
		
		System.out.println("**************************************");
		
		System.out.println("true & true : " +(true & true)); 
		System.out.println("true & false : " +(true & false)); //normalde java ilk false de�erini g�r�nce di�erlerine bakmadan alt kodlara ge�er ama tek operator false de�erini g�rsede ayn� sat�rda ikinci de�eri de okumaya devam ediyor
		System.out.println("false & true : " +(false & true));
		System.out.println("false & false : " +(false & false));
		
		System.out.println("**************************************");
		
		System.out.println("true || true : " +(true || true));
		System.out.println("true || false : " +(true || false));
		System.out.println("false || true : " +(false || true));
		System.out.println("false || false : " +(false || false));
		
		System.out.println("**************************************");

		System.out.println("true | true : " +(true | true));
		System.out.println("true | false : " +(true | false));
		System.out.println("false | true : " +(false | true));
		System.out.println("false | false : " +(false | false));
		
		System.out.println("**************************************");

		System.out.println("true ^ true : " +(true ^ true)); //  ^ de�eri tersine �evirir
		System.out.println("true ^ false : " +(true ^ false));
		System.out.println("false ^ true : " +(false ^ true));
		System.out.println("false ^ false : " +(false ^ false));
		
		System.out.println("**************************************");

		System.out.println("!true : " +(!true));
		System.out.println("!false : " +(!false));
	}

}
