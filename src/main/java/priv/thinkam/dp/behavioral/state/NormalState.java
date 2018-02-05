package priv.thinkam.dp.behavioral.state;

import java.util.concurrent.TimeUnit;

/**
 * @author thinkam
 * @date 2018/02/05
 */
public class NormalState implements State  {
	@Override
	public void program(Study study) {
		System.out.println("happy coding...");
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("after 1h...");
		study.setCurrentState(new BugState());
	}
}
