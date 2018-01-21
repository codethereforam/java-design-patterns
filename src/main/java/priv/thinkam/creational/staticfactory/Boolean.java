package priv.thinkam.creational.staticfactory;

/**
 * Created by thinkam on 1/21/18.
 */
public class Boolean {
	private final boolean value;
	private static final Boolean TRUE = new Boolean(true);
	private static final Boolean FALSE = new Boolean(false);

	public Boolean(boolean value) {
		this.value = value;
	}

	/**
	 * static factory method
	 * @param b
	 * @return
	 */
	public static Boolean valueOf(boolean b) {
		return b ? TRUE : FALSE;
	}

	@Override
	public String toString() {
		return value ? "true" : "false";
	}
}
