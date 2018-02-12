package priv.thinkam.dp.behavioral.responsibility.example3;

/**
 * @author thinkam
 * @date 2018/02/12
 */
public class StdoutLogger extends Logger {
	public StdoutLogger(Level level) {
		super(level);
	}

	@Override
	public void writeMessage(String message) {
		System.out.printf("write to stdout: %s\n", message);
	}
}
