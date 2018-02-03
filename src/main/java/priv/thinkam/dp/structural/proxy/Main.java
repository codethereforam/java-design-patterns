package priv.thinkam.dp.structural.proxy;

/**
 * @author thinkam
 * @date 2018/02/03
 */
public class Main {

	public static void main(String[] args) {
		Browser browser = new Browser(new ProxySoftware());
		BlockedSite google = new BlockedSite();
		String blockedContent = browser.browse(google);
		System.out.println(blockedContent);
	}

}
