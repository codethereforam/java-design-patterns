package priv.thinkam.dp.structural.adapter;

/**
 * @author thinkam
 * @date 2018/02/01
 */
public class MallardDuck implements Duck {
	@Override
	public void quack() {
		System.out.println("quack ... quack ...");
	}

	@Override
	public void fly() {
		System.out.println("I am flying...");
	}
}
