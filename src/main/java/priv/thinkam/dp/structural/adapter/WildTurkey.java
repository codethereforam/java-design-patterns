package priv.thinkam.dp.structural.adapter;

/**
 * @author thinkam
 * @date 2018/02/01
 */
public class WildTurkey implements Turkey {
	@Override
	public void gobble() {
		System.out.println("gobble ... gobble ...");
	}

	@Override
	public void fly() {
		System.out.println("I am flying  a short distance...");
	}
}
