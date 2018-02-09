package priv.thinkam.dp.behavioral.template;

/**
 * @author thinkam
 * @date 2018/02/09
 */
public abstract class AbstractClass {

	public void templateMethod() {
		concreteOperation();
		primitiveOperation1();
		primitiveOperation2();
	}

	private void concreteOperation() {
		System.out.println("do something");
	}

	abstract void primitiveOperation1();

	abstract void primitiveOperation2();
}
