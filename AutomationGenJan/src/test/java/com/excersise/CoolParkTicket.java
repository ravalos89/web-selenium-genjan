package com.excersise;

public class CoolParkTicket extends TicketsParks{
	
	double adultTicket, childTicket, studentTicket;
	int age;
	boolean student = false;
	String priceDay, park;
	
	// Constructor
	public CoolParkTicket(double price, int personAge, boolean studentID) {
		super();
		adultTicket = price;
		childTicket = price * (.80);
		studentTicket = price * (.50);
		age = personAge;
		student = studentID;
		priceDay = "Normal Day Price";
		park = "Cool Park - ";

	}
	
	//Encapsulation
	
	//Setter
	private void setPriceDay(String priceDay) {
		this.priceDay = priceDay;
	}
	
	//Getter
	private String getPriceDay(String priceDay) {
		return priceDay;
	}
	
	
	// METHOD
	@Override
	public double getTicketPrice() {
		double priceTicket;
//		if(student == true) {
//			priceTicket = studentTicket;
//			System.out.println("Student Price (50% applied): $"+studentTicket);
//		}else if(age>=18) {
//			priceTicket = adultTicket;
//			System.out.println("Adult Price: $"+adultTicket);
//		}else {
//			priceTicket = childTicket;
//			System.out.println("Child Price (20% applied): $"+childTicket);
//		}
		
		if(age>=18 && !student) {
			priceTicket = adultTicket;
			System.out.println("Adult Price: $"+adultTicket);			
		}else if(age>=18 && student) {
			priceTicket = studentTicket;
			System.out.println("Student Price (50% applied): $"+studentTicket);
		}else if(age<18 && student) {
			priceTicket = studentTicket * (0.80);
			System.out.println("Child & Student Special Price: $"+priceTicket);
		}else {
			priceTicket = childTicket;
			System.out.println("Child Price (20% applied): $"+childTicket);
		}
		
		return priceTicket;
	}
	
	//Overloading
	@Override
	public void printPriceDay() {
		System.out.println(welcomeMessageString() + park + getPriceDay(priceDay));
	}
	
	@Override
	public void printPriceDay(String keyManager, String priceDay) {
		setPriceDay(priceDay);
		System.out.println(welcomeMessageString() + park + getPriceDay(priceDay));
	}

}
