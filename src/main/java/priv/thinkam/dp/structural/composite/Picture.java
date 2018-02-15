package priv.thinkam.dp.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author thinkam
 * @date 2018/02/15
 */
public class Picture implements Graphic {
	private List<Graphic> graphics = new ArrayList<>();

	public void add(Graphic graphic) {
		graphics.add(graphic);
	}

	public void remove(Graphic graphic) {
		graphics.remove(graphic);
	}

	@Override
	public void draw() {
		graphics.forEach(Graphic::draw);
	}
}
