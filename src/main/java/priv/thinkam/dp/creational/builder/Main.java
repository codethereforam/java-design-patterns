package priv.thinkam.dp.creational.builder;

/**
 * @author thinkam
 * @date 2018/02/14
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("==== thin person ====");
		God god = new God(new ThinPeron());
		god.createPerson();

		System.out.println("==== fat person ====");
		god.setPerson(new FatPerson());
		god.createPerson();
	}

}
