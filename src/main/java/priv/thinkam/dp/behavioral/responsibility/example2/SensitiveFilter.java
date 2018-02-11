package priv.thinkam.dp.behavioral.responsibility.example2;

/**
 * @author thinkam
 * @date 2018/02/11
 */
public class SensitiveFilter implements Filter {

	@Override
	public void doFilter(Request request, Response response, FilterChain filterChain) {
		String requestContent = request.getRequestContent();
		requestContent = requestContent.replace("sensitive", "");
		requestContent += " ----processed by SensitiveFilter ";
		request.setRequestContent(requestContent);

		filterChain.doFilter(request, response, filterChain);

		String responseContent = response.getResponseContent();
		response.setResponseContent(responseContent + " ----processed by SensitiveFilter ");
	}
}
