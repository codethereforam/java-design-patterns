package priv.thinkam.dp.behavioral.responsibility.example3;

/**
 * @author thinkam
 * @date 2018/02/12
 */
public abstract class Logger {
	Level level;
	Logger next;

	protected Logger(Level level) {
		this.level = level;
	}

	protected Logger setNext(Logger logger) {
		this.next = logger;
		return this;
	}

	public void log(String message, Level priority) {
		if (priority.getNumber() <= level.getNumber()) {
			writeMessage(message);
			if (next != null) {
				next.log(message, priority);
			}
		}
	}

	public abstract void writeMessage(String message);
}
