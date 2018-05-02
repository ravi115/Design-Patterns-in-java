package Bridge;

public class BridgeTestApp {

	public static void main(String[] args) {

		// create a red color
		Color redColor = new RedColor();

		/// create a green color
		Color greenColor = new GreenColor();

		Shape shape = new Rectangle(redColor);
		shape.applycolor();

		shape = new Triangle(greenColor);
		shape.applycolor();
	}

}
