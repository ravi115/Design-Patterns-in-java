package Prototype;

public class Album implements PrototypeCapable {

	private String albumName;

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	@Override
	public String toString() {
		return "Album [albumName=" + albumName + "]";
	}

	@Override
	public PrototypeCapable clone() throws CloneNotSupportedException {

		System.out.println("Cloning Album Object......");
		return (PrototypeCapable) super.clone();
	}

}
