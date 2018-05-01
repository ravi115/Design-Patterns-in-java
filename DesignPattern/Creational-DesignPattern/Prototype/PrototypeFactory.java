package Prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {

	private static Map<String, PrototypeCapable> prototypes = new HashMap<>();

	static {
		prototypes.put(ModelTypeEnum.MOVIE.getModelType(), new Movie());
		prototypes.put(ModelTypeEnum.ALBUM.getModelType(), new Album());
		prototypes.put(ModelTypeEnum.SHOW.getModelType(), new Show());
	}

	public static PrototypeCapable getInstance(final String modelType) throws CloneNotSupportedException {
		return prototypes.get(modelType).clone();
	}
}
