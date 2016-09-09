package com.method.ty;


public class Methods {

	public static void main(String[] args) {
		String schedule;
		int dispense;
		double amount;
		String name;

		schedule = "Monday Wednesday Friday Saturday";
		dispense = 5;
		amount = 12.4;
		name = "Garfield";

		feedCat(schedule,dispense,amount,name);
		System.out.println(feedCat(schedule,dispense,amount,name));
	}

	
	
	
	
	
	public static String feedCat(String methodschedule, int methoddispense, double methodamount, String methodname) {
		String info = "";
		String info1 = "Here are your instructions\n";
		String info2 = "1.) Feed "+methodname+" On these days: "+methodschedule +"\n";
		String info3 = "Only " + methoddispense + " times a day. \n";
		String info4 = "Give " + methodname + methodamount + "Ounces. \n";
		String info5 = "Thank you!";
		
		info = info1 +info2 + info3 +info4 + info5;

		return info;
	}

}
