package priv.thinkam.dp.behavioral.responsibility.example2;

/**
 * @author thinkam
 * @date 2018/02/11
 */
public class MessageProcessor {
	private Request request;
	private Response response;
	private FilterChain filterChain;

	public MessageProcessor(Request request, Response response, FilterChain filterChain) {
		this.request = request;
		this.response = response;
		this.filterChain = filterChain;
	}

	public Request getRequest() {
		return request;
	}

	public Response getResponse() {
		return response;
	}

	public void process() {
		filterChain.doFilter(request, response, filterChain);
	}
}
