package priv.thinkam.dp.behavioral.responsibility.example2;

/**
 * @author thinkam
 * @date 2018/02/11
 */
public class Main {

	public static void main(String[] args) {
		Request request = new Request("<script> normal :) sensitive :) normal </script>");
		Response response = new Response("response content");

		FilterChain filterChain = new FilterChain();
		filterChain.addFilter(new ScriptFilter()).addFilter(new FaceFilter()).addFilter(new SensitiveFilter());

		MessageProcessor messageProcessor = new MessageProcessor(request, response, filterChain);
		System.out.println("request before process: " + messageProcessor.getRequest().getRequestContent());
		System.out.println("response before process: " + messageProcessor.getResponse().getResponseContent());

		messageProcessor.process();
		System.out.println("request after process: " + messageProcessor.getRequest().getRequestContent());
		System.out.println("response after process: " + messageProcessor.getResponse().getResponseContent());
	}

}
