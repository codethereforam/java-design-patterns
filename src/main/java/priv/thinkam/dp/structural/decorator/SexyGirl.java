package priv.thinkam.dp.structural.decorator;

/**
 * @author thinkam
 * @date 2018/01/31
 */
public class SexyGirl extends Person {
	@Override
	String dressUp() {
		return this.describe();
	}

	public String describe() {
		return "a sexy girl";
	}
}
