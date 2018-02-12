package priv.thinkam.dp.behavioral.responsibility.example3;

/**
 * @author thinkam
 * @date 2018/02/12
 */
public enum Level {
	DEBUG(3), NOTICE(2), ERROR(1);
	private int number;

	Level(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}
}
