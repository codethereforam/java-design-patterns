package priv.thinkam.dp.structural.bridge;

/**
 * Created by thinkam on 1/27/18.
 */
public class Linux extends OS {
	@Override
	public void run() {
		System.out.println("linux " + this.software.run());
	}
}
