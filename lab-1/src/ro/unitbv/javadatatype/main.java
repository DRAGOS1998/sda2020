package Problema3;

public class main {

	public static void main(String[] args) {

		PaymentMethod p1 = new PaymentMethod("Card");
		Adress c1 = new Adress("Strada Nicopole", "Brasov", 12);
		Customer customer1 = new Customer("Florea", "Dragos", 20, c1,p1);
		System.out.println(customer1.getCompleteName());
		System.out.println(customer1.getAdress().getFullAdress());
		System.out.println(customer1.getPaymentMethod().getType());
		}
	}