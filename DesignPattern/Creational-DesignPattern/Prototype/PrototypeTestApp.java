package Prototype;

public class PrototypeTestApp {

	public static void main(String[] args) throws CloneNotSupportedException {

		System.out.println("Illustration of Prototype Design Pattern.............");

		PrototypeCapable moviePrototypeCapable = PrototypeFactory.getInstance(ModelTypeEnum.MOVIE.getModelType());
		PrototypeCapable albumPrototypeCapable = PrototypeFactory.getInstance(ModelTypeEnum.ALBUM.getModelType());
		PrototypeCapable showPrototypeCapable = PrototypeFactory.getInstance(ModelTypeEnum.SHOW.getModelType());

		System.out.println(moviePrototypeCapable);
		System.out.println(albumPrototypeCapable);
		System.out.println(showPrototypeCapable);

		System.out.println("< ========= *** Let's modify the cloned Object *** ========= >");

		Movie movie = (Movie) moviePrototypeCapable.clone();
		System.out.println("after cloning .... " + movie);

		movie.setMovieName("race3");
		System.out.println("after modifying : " + movie);
	}

}
