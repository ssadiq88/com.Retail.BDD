package stringsMapulation;

public class FlightTicket {
	
	public int flightNumber;
	public int seatNumber;
	public String ticketCatagory;
	public int ticketID;
	
	public static  int availableSeat =50;
	
	public FlightTicket(int flightNumber, int seatNumber, String ticketCatagory, int ticketID) {
		super();
		this.flightNumber = flightNumber;
		this.seatNumber = seatNumber;
		this.ticketCatagory = ticketCatagory;
		this.ticketID = ticketID;
	}
	
	public static void main(String [] args) {
		
		FlightTicket ticket = new FlightTicket( 1122, 2, "Economy", 12345);
		availableSeat--;
		System.out.println("Avaialble seats new::"  +  availableSeat);
		
		FlightTicket ticket2 = new FlightTicket( 222, 3, "Business", 22343);
		availableSeat--;
		System.out.println("Avaialble seats new::"  +  availableSeat);
		
		FlightTicket ticket3 = new FlightTicket( 21, 4, "Business", 443);
		availableSeat--;
		System.out.println("Avaialble seats new::"  +  availableSeat);
	}
	
	
	

}
