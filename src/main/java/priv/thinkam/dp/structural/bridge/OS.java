package priv.thinkam.dp.structural.bridge;

/**
 * Created by thinkam on 1/27/18.
 */
public abstract class OS {
	protected Software software;

	public void setSoftware(Software software) {
		this.software = software;
	}

	abstract void run();
}
