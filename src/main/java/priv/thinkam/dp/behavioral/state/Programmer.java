package priv.thinkam.dp.behavioral.state;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @author thinkam
 * @date 2018/02/05
 */
public class Programmer {
	private State currentState;
	private Random random = new Random();

	public Programmer(State currentState) {
		this.currentState = currentState;
	}

	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}

	public void switchState() {
		currentState.program(this);
	}

	public void work() {
		System.out.println("==== open the laptop ====");
		this.switchState();
		timeGoesBy();

		while(true) {
			System.out.printf("==== after %sh ====\n", random.nextInt(3) + 1);
			this.switchState();
			timeGoesBy();

			System.out.printf("==== after %smin ====\n", random.nextInt(50) + 5);
			this.switchState();
			timeGoesBy();

			System.out.printf("==== after %smin ====\n", random.nextInt(5) + 1);
			this.switchState();
			timeGoesBy();
		}
	}

	private static void timeGoesBy() {
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
