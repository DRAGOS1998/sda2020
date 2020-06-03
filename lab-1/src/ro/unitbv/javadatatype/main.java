package ro.unitbv.javadatatype;




import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {

	public static void main(String[] args) {

		List<Shape> shapes = new ArrayList<>();
		
		shapes.add(new Dreptunghi("#003e51", 0, 20, 20));
		

		
		shapes.add(new Patrat("#ffb554", 0, 30));
		

		
		shapes.add(new Cerc("#a9a9ad", 0, 10));
		

		
		for(int i = 0; i<shapes.size(); i++)
		{
			System.out.println(shapes.get(i).getName());
			System.out.println(shapes.get(i).getArea());
			System.out.println(shapes.get(i).getHexFillColor());
			shapes.get(i).draw();
		}

	}

}
