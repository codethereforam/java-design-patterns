package priv.thinkam.dp.structural.adapter;

/**
 * @author thinkam
 * @date 2018/02/01
 */
public class Main {

	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		System.out.println("==== mallard duck ====");
		duck.quack();
		duck.fly();

		Turkey turkey = new WildTurkey();
		System.out.println("==== wild turkey ====");
		turkey.gobble();
		turkey.fly();

		Duck superTurkey = new TurkeyAdapter(turkey);
		System.out.println("==== super turkey ====");
		superTurkey.quack();
		superTurkey.fly();
	}

}
