package priv.thinkam.dp.structural.proxy;

/**
 * @author thinkam
 * @date 2018/02/03
 */
public class Main {

	public static void main(String[] args) {
        Browsable browsable = new ProxySoftware(new Browser());
		BlockedSite google = new BlockedSite();
		String blockedContent = browsable.browse(google);
		System.out.println(blockedContent);
	}

}
