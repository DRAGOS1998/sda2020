package Problema2lab2;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
public class Problema2lab2 {
	public static void main(String[] args) {

		ArrayList<Integer> sir = new ArrayList<>();
		Random al = new Random();
		for(int i =0; i<10; i++)
		{
			//Aici generez/adaug random un numar de 10 pacienti in intervalul [30,41] in arraylist.
			sir.add(al.nextInt(41-30)+30); // * (maxim-minim)+minim
		}
		//Trebuie sa obtin cumva lungimea sirului pentru a intera.
		Integer[] array = sir.toArray(new Integer[sir.size()]);
		for(int i = 0; i<array.length; i++)
		{
			if(array[i]<36 || array[i]>38)
			{
				System.out.println("Temperatura Anormala : " +array[i] + " -> Pacient [ID] " + i);

			}else if(array[i] == 37 || array[i] == 36)
			{
				System.out.println("Temperatura normala : " +array[i] + " -> Pacient[ID] " + i);
			}
		}
	}

}
