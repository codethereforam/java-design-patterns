package priv.thinkam.dp.behavioral.state;

import java.util.concurrent.TimeUnit;

/**
 * @author thinkam
 * @date 2018/02/05
 */
public class BugState implements State {
	@Override
	public void program(Study study) {
		System.out.println("come across a bug, fuck...");
		System.out.println("debug to find the cause of the bug...");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("after 20min...");
		study.setCurrentState(new FixBugState());
	}
}
