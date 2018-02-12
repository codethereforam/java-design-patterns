package priv.thinkam.dp.behavioral.responsibility.example3;

/**
 * @author thinkam
 * @date 2018/02/12
 */
public class EmailLogger extends Logger {
	public EmailLogger(Level level) {
		super(level);
	}

	@Override
	public void writeMessage(String message) {
		System.out.printf("send via email: %s\n", message);
	}
}
