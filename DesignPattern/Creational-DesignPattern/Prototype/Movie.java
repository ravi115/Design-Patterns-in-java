package Prototype;

public class Movie implements PrototypeCapable {

	private String movieName;

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + "]";
	}

	@Override
	public PrototypeCapable clone() throws CloneNotSupportedException {

		System.out.println("Cloning Movie Object.........!");

		return (PrototypeCapable) super.clone();
	}

}
