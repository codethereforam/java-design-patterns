package priv.thinkam.dp.structural.decorator;

/**
 * @author thinkam
 * @date 2018/01/31
 */
public class PersonWithMiniSkirt extends DressedPerson {
	public PersonWithMiniSkirt(Person person) {
		super(person);
	}

	@Override
	String dressUp() {
		return this.person.dressUp() + ", wear a pink miniskirt";
	}
}
