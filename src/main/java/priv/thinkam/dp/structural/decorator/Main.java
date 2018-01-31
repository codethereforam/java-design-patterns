package priv.thinkam.dp.structural.decorator;

/**
 * @author thinkam
 * @date 2018/01/31
 */
public class Main {

	public static void main(String[] args) {
		Person sexyGirl = new PersonWithMiniSkirt(new PersonWithTshirt(new SexyGirl()));
		System.out.println(sexyGirl.dressUp());
		sexyGirl.walk();
	}

}
