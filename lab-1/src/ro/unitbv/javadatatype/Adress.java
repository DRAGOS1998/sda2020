package Problema3;

public class Adress {
	private String street,city;
	private int number;

	public Adress(String street, String city, int number) {
		this.street = street;
		this.city = city;
		this.number = number;
	}
	public String getStreet() {
		return street;
	}
	public String getCity() {
		return city;
	}
	public int getNumber() {
		return number;
	}

	public String getFullAdress()
	{
		return city + " " + street + " " + number;
	}






}
