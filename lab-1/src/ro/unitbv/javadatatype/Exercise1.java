package ro.unitbv.javadatatype;

import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		System.out.println("test");
	
	    Scanner scanner = new Scanner(System.in);
		
	    System.out.println("introdu nr1: ");
	    int nr1 = scanner.nextInt();				
	    System.out.println("nr citit este:"+ nr1);
	    
	    System.out.println("introdu nr2: ");
	    int nr2 = scanner.nextInt();
	    int suma = nr1 + nr2;
	    int produs = nr1 * nr2;
	    double media = (nr1 + nr2) / 2;
	    double impartire = (double)nr1 / nr2;
	    int distanta;
		if (nr1 > nr2)
	    	distanta = nr1 - nr2;
	    else 
	    	distanta = nr2 - nr1;
	    System.out.println("nr citit este:"+ nr2);
	    System.out.println("------------------------");
	    System.out.println("Suma numerelor este: "+ suma);
	    System.out.println("Produsul este: " + produs);
	    System.out.println("Media este: " + media);
	    System.out.println("Distanta este: " + distanta);
	    System.out.println("Maximul celor doua numere este: "+ Math.max(nr1,  nr2));
	    System.out.println("" + impartire);

}

}
