package priv.thinkam.dp.behavioral.state;

/**
 * @author thinkam
 * @date 2018/02/05
 */
public class BugState implements State {
	@Override
	public void program(Programmer programmer) {
		System.out.println("come across a bug, fuck...");
		System.out.println("debug to find the cause of the bug...");
		programmer.setCurrentState(new FixBugState());
	}
}
