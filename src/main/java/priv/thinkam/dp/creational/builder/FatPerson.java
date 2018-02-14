package priv.thinkam.dp.creational.builder;

/**
 * @author thinkam
 * @date 2018/02/14
 */
public class FatPerson implements Person {
	@Override
	public void createHead() {
		System.out.println("fat head");
	}

	@Override
	public void createLimbs() {
		System.out.println("fat limbs");
	}

	@Override
	public void createBody() {
		System.out.println("fat body");
	}
}
