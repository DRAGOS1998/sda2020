package ro.unitbv.javadatatype;


public class Patrat implements Shape {

	private String fillColor;
	private int BorderWidth;
	private int size;
	private final String nume;

	public Patrat(String fillColor, int borderWidth, int size) {
		this.nume = "Patrat";
		this.fillColor = fillColor;
		this.BorderWidth = borderWidth;
		this.size = size;
	}

	@Override
	public void draw() {

		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= size - 1; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return size * size;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return nume;
	}

	@Override
	public String getHexFillColor() {
		String valid_mesaj = null;
		char[] hexchars = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'A', 'B',
				'C', 'D', 'E', 'F' };

		for (char simbol : fillColor.toCharArray()) {

			boolean valid = false;
			for (char hexchar : hexchars) {
				if (simbol == hexchar) {
					if (fillColor.charAt(0) == '#') {
						valid = true;
						valid_mesaj = "Hex valid";
					} else {
						valid = false;
						valid_mesaj = "Hex invalid";

					}
				}
			}
		}
		return valid_mesaj;
	}

	@Override
	public int getBorderWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

}