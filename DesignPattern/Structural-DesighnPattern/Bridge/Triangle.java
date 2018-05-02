package Bridge;

public class Triangle extends Shape {

	public Triangle(Color color) {
		super(color);
	}

	@Override
	public void applycolor() {
		System.out.println("Triangle is filled with - ");
		color.applyColor();
	}

}
