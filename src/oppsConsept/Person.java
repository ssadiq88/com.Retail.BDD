package oppsConsept;

public class Person {

	private String name;
	private String nationality;
	private String brithDate;
	private int seatNumber;

	public Person(String name, String nationality, String brithDate, int seatNumber) {

		this.name = name;
		this.nationality = nationality;
		this.brithDate = brithDate;
		this.seatNumber = seatNumber;

	}

	public String getName() {

		return name;

	}

	public String getNationality() {

		return nationality;
	}

	public String getBrithDate() {

		return brithDate;
	}

	public int getSeatNumber() {

		return seatNumber;
	}
	
	public void setName(String name) {

		this.name=name;
}
	public void setNationality(String nationality) {

		this.nationality=nationality;
}
	public void setBrithDate(String brithDate) {

		this.brithDate=brithDate;
	
}
	public void setSeatNumber(int seatNumber) {

		this.seatNumber=seatNumber;
		
	System.out.println(this.name);
	System.out.println(this.nationality);
	System.out.println(this.brithDate);
	System.out.println(this.seatNumber);
}
}
