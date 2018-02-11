package priv.thinkam.dp.behavioral.responsibility.example1;

/**
 * @author thinkam
 * @date 2018/02/11
 */
public class MessageProcessor {
	private String message;
	private FilterChain filterChain;

	public MessageProcessor(String message, FilterChain filterChain) {
		this.message = message;
		this.filterChain = filterChain;
	}

	public void process() {
		message = filterChain.doFilter(message);
	}

	public String getMessage() {
		return message;
	}
}
