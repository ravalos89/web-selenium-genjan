package com.excersise;

public class TicketDesk {

	public static void main(String[] args) {
		
        double precioCoolPark=150;
        double precioTestersPark=160;
        int age=10;
        boolean student=true;
		
//		// TODO Auto-generated method stub
//		CoolParkTicket coolPark = new CoolParkTicket(precioCoolPark, age, student);
//		coolPark.printPriceDay("xyz", "Dia del niño");
//		coolPark.getTicketPrice();
//		
//		TestersParkTicket testersPark = new TestersParkTicket(precioTestersPark, age, student);
//		testersPark.printPriceDay("xyz", "Dia del niño");
//		testersPark.getTicketPrice();
        
        TicketsParks ticket = new CoolParkTicket(precioCoolPark, age, student);
        ticket.printPriceDay();
        double priceCoolTicket= ticket.getTicketPrice();
          
        ticket = new TestersParkTicket(precioTestersPark, age, student, 10); //Polimorfismo
        ticket.printPriceDay();
        double priceTestersTicket= ticket.getTicketPrice();
        
        double totalPrice = sumTicketsParks(priceCoolTicket, priceTestersTicket);
        
        System.out.println("Total Tickets: $"+totalPrice);
        
        
	}
	
	public static double sumTicketsParks(double park1, double park2) {
		return park1 + park2;
	}
	
	public static double sumTicketsParks(double park1, double park2, double park3) {
		return park1 + park2;
	}
	
	public static double sumTicketsParks(double park1, double park2, boolean xyz) {
		return park1 + park2;
	}
	
	public static boolean sumTicketsParks(boolean park1) {
		return park1;
	}

}
