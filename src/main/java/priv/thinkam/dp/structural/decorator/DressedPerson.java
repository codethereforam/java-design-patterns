package priv.thinkam.dp.structural.decorator;

/**
 * @author thinkam
 * @date 2018/01/31
 */
public abstract class DressedPerson extends Person {
	protected Person person;

	public DressedPerson(Person person) {
		this.person = person;
	}
}
