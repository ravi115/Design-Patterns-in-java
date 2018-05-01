package Prototype;

/**
 * This is an ENUM class which holds the all type of available model in an
 * application.
 * 
 * @author raviranjan
 *
 */
public enum ModelTypeEnum {

	MOVIE("movie"), ALBUM("album"), SHOW("show");

	private String modelType;

	private ModelTypeEnum(final String modelType) {
		this.modelType = modelType;
	}

	public String getModelType() {
		return modelType;
	}

	public void setModelType(String modelType) {
		this.modelType = modelType;
	}

}
