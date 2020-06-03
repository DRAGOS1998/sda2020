package ro.unitbv.javadatatype;

public class Dreptunghi implements Shape {

	private final String nume;
	private String fillColor;
	private int BorderWidth;
	private int height, width;

	public Dreptunghi(String fillColor, int borderWidth, int height, int width) {
		this.nume = "Dreptunghi";
		this.fillColor = fillColor;
		BorderWidth = borderWidth;
		this.height = height;
		this.width = width;
	}

	@Override
	public void draw() {
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}

	}

	@Override
	public double getArea() {

		// TODO Auto-generated method stub
		return height * width;
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

						valid_mesaj = "Hex valid";
					} else {

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
