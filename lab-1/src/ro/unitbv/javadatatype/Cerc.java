package ro.unitbv.javadatatype;

public class Cerc implements Shape {

	private String fillColor;
	private int BorderWidth;
	private int radius;

	public Cerc(String fillColor, int borderWidth, int radius) {

		this.fillColor = fillColor;
		BorderWidth = borderWidth;
		this.radius = radius;
	}

	@Override
	public void draw() {

		double dist;

		for (int i = 0; i <= 2 * radius; i++) {

			for (int j = 0; j <= 2 * radius; j++) {
				dist = Math.sqrt((i - radius) * (i - radius) + (j - radius) * (j - radius));

				if (dist > radius - 0.5 && dist < radius + 0.5)
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.print("\n");
		}
	}

	@Override
	public double getArea() {
		final double pi = Math.PI;
		return pi * radius * radius;
	}

	@Override
	public String getName() {

		return "Cerc";
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

		return 0;
	}

}
