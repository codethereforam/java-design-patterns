package priv.thinkam.dp.behavioral.template.java8;

/**
 * @author thinkam
 * @date 2019/12/29 22:20
 */
public class TemplateDemo {

	public void templateMethod(PrimitiveOperation operation1, PrimitiveOperation operation2) {
		concreteOperation();
		operation1.doSomething();
		operation2.doSomething();
	}

	private void concreteOperation() {
		System.out.println("do something");
	}
}
