package priv.thinkam.dp.behavioral.responsibility.example1;

/**
 * @author thinkam
 * @date 2018/02/11
 */
public class Main {

	public static void main(String[] args) {
		String message = "<script> normal :) sensitive :) normal </script>";
		FilterChain filterChain1 = new FilterChain();
		filterChain1.addFilter(new ScriptFilter()).addFilter(new FaceFilter());

		FilterChain filterChain2 = new FilterChain();
		filterChain2.addFilter(new SensitiveFilter()).addFilter(filterChain1);

		MessageProcessor messageProcessor = new MessageProcessor(message, filterChain2);
		System.out.println("before process: " + messageProcessor.getMessage());
		messageProcessor.process();
		System.out.println("after process: " + messageProcessor.getMessage());
	}

}
