package Problema1lab2;

public class a {

	public static void main(String[] args) {

		//tipdrum_elseif("Oras");
		//tipdrum_ifelse("Oras");
		//tipdrum_switch("Oras");

	}

	//Functie tip_drum - Forma elseif
	public static void tipdrum_elseif(String tip)
	{
		int viteza;
		if(tip == "Oras")
		{
			viteza = 50;
			System.out.println("Viteza adminsa pentru " + tip +" este : " + viteza +" Km/h.");
		}
		else if(tip == "Zona rezidentiala")
		{
			viteza = 30;
			System.out.println("Viteza adminsa pentru " + tip +" este : " + viteza +" Km/h.");
		}
		else if(tip == "Drum Express")
		{
			viteza = 100;
			System.out.println("Viteza adminsa pentru " + tip +" este : " + viteza +" Km/h.");
		}
		else if(tip == "Autostrada")
		{
			viteza = 130;
			System.out.println("Viteza adminsa pentru " + tip +" este : " + viteza +" Km/h.");
		}
	}

	////Functie tip_drum - Forma if else
	public static void tipdrum_ifelse(String tip)
	{
		int viteza;
		if(tip == "Oras")
		{
			viteza = 50;
			System.out.println("Viteza adminsa pentru " + tip +" este : " + viteza +" Km/h.");
		}
		else
		{
			System.exit(0);
		}
		if(tip == "Zona rezidentiala")
		{
			viteza = 30;
			System.out.println("Viteza adminsa pentru " + tip +" este : " + viteza +" Km/h.");
		}
		else
		{
			System.exit(0);
		}
		if(tip == "Drum Express")
		{
			viteza = 100;
			System.out.println("Viteza adminsa pentru " + tip +" este : " + viteza +" Km/h.");
		}
		else
		{
			System.exit(0);
		}
		if(tip == "Autostrada")
		{
			viteza = 130;
			System.out.println("Viteza adminsa pentru " + tip +" este : " + viteza +" Km/h.");
		}
	}

////Functie tip_drum - Forma switch

	public static void tipdrum_switch(String tip)
	{
		int viteza;
		switch(tip)
		{
		case "Oras":
			viteza = 50;
			System.out.println("Viteza adminsa pentru " + tip +" este : " + viteza +" Km/h.");
			break;
		case "Zona rezidentiala":
			viteza = 30;
			System.out.println("Viteza adminsa pentru " + tip +" este : " + viteza +" Km/h.");
			break;
		case "Drum Express":
			viteza = 100;
			System.out.println("Viteza adminsa pentru " + tip +" este : " + viteza +" Km/h.");
			break;
		case "Autostrada" : 
			viteza = 130;
			System.out.println("Viteza adminsa pentru " + tip +" este : " + viteza +" Km/h.");
			break;

		}
	}


}
