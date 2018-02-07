package priv.thinkam.dp.behavioral.observer;

import java.util.concurrent.TimeUnit;

/**
 * @author thinkam
 * @date 2018/02/07
 */
public class Main {

	public static void main(String[] args) {
		Button okBtn = new Button("OK");
		okBtn.addMouseListener(e -> {
			System.out.println("'OK' button clicked");
			Button button = (Button) e.getSource();
			System.out.printf("--- log: label of the clicked button is %s ----", button.getLabel());
		});

		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("==== someone clicks the button ====");
		okBtn.perform();
	}

}
