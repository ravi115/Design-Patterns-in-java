package Bridge;

public class Rectangle extends Shape {

	public Rectangle(Color color) {
		super(color);
	}

	@Override
	public void applycolor() {
		System.out.println("Rectangle is filled with - ");
		color.applyColor();
	}

}
