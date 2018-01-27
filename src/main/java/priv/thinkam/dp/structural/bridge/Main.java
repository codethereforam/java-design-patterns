package priv.thinkam.dp.structural.bridge;

/**
 * Created by thinkam on 1/27/18.
 */
public class Main {

	public static void main(String[] args) {
		OS os = new Windows();
		os.setSoftware(new Idea());
		os.run();

		os.setSoftware(new Chrome());
		os.run();

		os =new Linux();
		os.setSoftware(new Idea());
		os.run();

		os.setSoftware(new Chrome());
		os.run();
	}

}
