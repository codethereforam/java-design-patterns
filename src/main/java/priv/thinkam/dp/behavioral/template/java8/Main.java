package priv.thinkam.dp.behavioral.template.java8;

/**
 * @author thinkam
 * @date 2019/12/29 22:20
 */
public class Main {

	public static void main(String[] args) {
		new TemplateDemo().templateMethod(() -> System.out.println("operation1 implementationA"),
				() -> System.out.println("operation2 implementationA"));

		new TemplateDemo().templateMethod(() -> System.out.println("operation1 implementationB"),
				() -> System.out.println("operation2 implementationB"));
	}

}
