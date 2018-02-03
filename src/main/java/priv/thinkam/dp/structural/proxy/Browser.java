package priv.thinkam.dp.structural.proxy;

/**
 * @author thinkam
 * @date 2018/02/03
 */
public class Browser implements Browsable {
	private Browsable browsable;

	public Browser(Browsable browsable) {
		this.browsable = browsable;
	}

	@Override
	public String browse(BlockedSite blockedSite) {
		return browsable.browse(blockedSite);
	}
}
