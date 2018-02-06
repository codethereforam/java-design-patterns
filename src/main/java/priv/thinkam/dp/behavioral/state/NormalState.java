package priv.thinkam.dp.behavioral.state;

/**
 * @author thinkam
 * @date 2018/02/05
 */
public class NormalState implements State  {
	@Override
	public void program(Programmer programmer) {
		System.out.println("happy coding...");
		programmer.setCurrentState(new BugState());
	}
}
