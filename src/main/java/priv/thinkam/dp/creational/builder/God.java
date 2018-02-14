package priv.thinkam.dp.creational.builder;

/**
 * @author thinkam
 * @date 2018/02/14
 */
public class God {
	private Person person;

	public God(Person person) {
		this.person = person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public void createPerson() {
		person.createHead();
		person.createBody();
		person.createLimbs();
	}
}
