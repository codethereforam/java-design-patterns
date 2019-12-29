package priv.thinkam.dp.behavioral.template.legacy;

/**
 * @author thinkam
 * @date 2018/02/09
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("==== A ====");
		new ConcreteClassA().templateMethod();

		System.out.println("==== B ====");
		new ConcreteClassB().templateMethod();
	}

}
