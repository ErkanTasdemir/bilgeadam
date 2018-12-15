package com.bilgeadam.conditions;

public class LogicalOperators {

	public static void main(String[] args) {

		System.out.println("true && true : " +(true && true));
		System.out.println("true && false : " +(true && false));
		System.out.println("false && true : " +(false && true));
		System.out.println("false && false : " +(false && false));
		
		System.out.println("**************************************");
		
		System.out.println("true & true : " +(true & true)); 
		System.out.println("true & false : " +(true & false)); //normalde java ilk false deðerini görünce diðerlerine bakmadan alt kodlara geçer ama tek operator false deðerini görsede ayný satýrda ikinci deðeri de okumaya devam ediyor
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

		System.out.println("true ^ true : " +(true ^ true)); //  ^ deðeri tersine çevirir
		System.out.println("true ^ false : " +(true ^ false));
		System.out.println("false ^ true : " +(false ^ true));
		System.out.println("false ^ false : " +(false ^ false));
		
		System.out.println("**************************************");

		System.out.println("!true : " +(!true));
		System.out.println("!false : " +(!false));
	}

}
