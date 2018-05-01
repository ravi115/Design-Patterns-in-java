package Prototype;

public class Show implements PrototypeCapable {

	private int showTime;

	public int getShowTime() {
		return showTime;
	}

	public void setShowTime(int showTime) {
		this.showTime = showTime;
	}

	@Override
	public String toString() {
		return "Show [showTime=" + showTime + "]";
	}

	@Override
	public PrototypeCapable clone() throws CloneNotSupportedException {

		System.out.println("cloning show object.....");
		return (PrototypeCapable) super.clone();
	}

}
