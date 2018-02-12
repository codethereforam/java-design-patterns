package priv.thinkam.dp.behavioral.responsibility.example3;

/**
 * @author thinkam
 * @date 2018/02/12
 */
public class ErrorLogger extends Logger {
	public ErrorLogger(Level level) {
		super(level);
	}

	@Override
	public void writeMessage(String message) {
		System.out.printf("send to stderr: %s\n", message);
	}
}
