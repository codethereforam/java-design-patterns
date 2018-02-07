package priv.thinkam.dp.behavioral.observer;

/**
 * @author thinkam
 * @date 2018/02/07
 */
public class Button extends Component {
	private String label;

	public Button(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@Override
	void perform() {
		mouseListeners.forEach(l -> l.mouseClicked(new MouseEvent(this)));
	}
}
