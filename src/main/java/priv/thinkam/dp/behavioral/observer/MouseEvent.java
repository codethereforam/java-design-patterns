package priv.thinkam.dp.behavioral.observer;

/**
 * @author thinkam
 * @date 2018/02/07
 */
public class MouseEvent {
	private Object source;

	public MouseEvent(Object source) {
		this.source = source;
	}

	public Object getSource() {
		return source;
	}

}
