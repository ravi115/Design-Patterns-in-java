package Prototype;

/**
 * 
 * @author raviranjan
 *
 */
public interface PrototypeCapable extends Cloneable {

	public PrototypeCapable clone() throws CloneNotSupportedException;
}
