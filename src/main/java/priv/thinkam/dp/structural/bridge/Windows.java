package priv.thinkam.dp.structural.bridge;

/**
 * Created by thinkam on 1/27/18.
 */
public class Windows extends OS {

	@Override
	public void run() {
		System.out.println("windows " + this.software.run());
	}
}
