package priv.thinkam.dp.creational.builder;

/**
 * @author thinkam
 * @date 2018/02/14
 */
public class ThinPeron implements Person {
	@Override
	public void createHead() {
		System.out.println("thin head");
	}

	@Override
	public void createLimbs() {
		System.out.println("thin limbs");
	}

	@Override
	public void createBody() {
		System.out.println("thin body");
	}
}
