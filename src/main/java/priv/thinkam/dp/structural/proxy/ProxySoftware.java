package priv.thinkam.dp.structural.proxy;

/**
 * @author thinkam
 * @date 2018/02/03
 */
public class ProxySoftware implements Browsable {
    private Browsable browsable;

    ProxySoftware(Browsable browsable) {
        this.browsable = browsable;
    }

    @Override
    public String browse(BlockedSite blockedSite) {
        // can do something here
        String response = browsable.browse(blockedSite);
        // can do something here
        return response;
    }
}
