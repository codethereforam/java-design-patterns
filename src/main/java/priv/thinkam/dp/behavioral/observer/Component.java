package priv.thinkam.dp.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author thinkam
 * @date 2018/02/07
 */
public abstract class Component {
	protected List<MouseListener> mouseListeners = new ArrayList<>();

	void addMouseListener(MouseListener mouseListener) {
		mouseListeners.add(mouseListener);
	}

	void removeMouseListener(MouseListener mouseListener) {
		mouseListeners.remove(mouseListener);
	}

	abstract void perform();
}
