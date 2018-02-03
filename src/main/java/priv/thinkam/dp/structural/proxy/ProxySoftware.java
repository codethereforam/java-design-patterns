package priv.thinkam.dp.structural.proxy;

/**
 * @author thinkam
 * @date 2018/02/03
 */
public class ProxySoftware implements Browsable {

	@Override
	public String browse(BlockedSite blockedSite) {
		// can do something extra here
		return blockedSite.response();
	}
}
