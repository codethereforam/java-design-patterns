package priv.thinkam.dp.behavioral.state;

/**
 * @author thinkam
 * @date 2018/02/05
 */
public class FixBugState implements State {
	@Override
	public void program(Programmer programmer) {
		System.out.println("bug fixed, ha ha ha....");
		System.out.println("bug fixed, ha ha ha....");
		programmer.setCurrentState(new NormalState());
	}
}
