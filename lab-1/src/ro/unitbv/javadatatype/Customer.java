package Problema3;

public class Customer {

	private String lastName,firstName;
	private int age;
	private Adress adress;
	private PaymentMethod p1;

	public Customer(String lastName, String firstName, int age, Adress adress,PaymentMethod p1) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
		this.adress = adress;
		this.p1 = p1;
	}
	public String getLastName() {
		return lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public int getAge() {
		return age;
	}
	public String getCompleteName()
	{
		return firstName +" " + lastName;
	}
	public Adress getAdress()
	{
		return adress;
	}

	public PaymentMethod getPaymentMethod()
	{
		return p1;
	}
}