package priv.thinkam.dp.behavioral.responsibility.example2;

/**
 * @author thinkam
 * @date 2018/02/11
 */
public class ScriptFilter implements Filter {

	@Override
	public void doFilter(Request request, Response response, FilterChain filterChain) {
		String requestContent = request.getRequestContent();
		requestContent = requestContent.replace("<", "&lt;")
				.replace(">", "&gt;");
		requestContent += " ----processed by ScriptFilter ";
		request.setRequestContent(requestContent);

		filterChain.doFilter(request, response, filterChain);

		String responseContent = response.getResponseContent();
		response.setResponseContent(responseContent + " ----processed by ScriptFilter ");
	}
}
