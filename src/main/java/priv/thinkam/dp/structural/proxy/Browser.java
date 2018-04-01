package priv.thinkam.dp.structural.proxy;

/**
 * @author thinkam
 * @date 2018/02/03
 */
public class Browser implements Browsable {

	@Override
	public String browse(BlockedSite blockedSite) {
        return blockedSite.response();
	}
}
