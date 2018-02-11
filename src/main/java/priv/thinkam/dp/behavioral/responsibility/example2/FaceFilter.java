package priv.thinkam.dp.behavioral.responsibility.example2;

/**
 * @author thinkam
 * @date 2018/02/11
 */
public class FaceFilter implements Filter {

	@Override
	public void doFilter(Request request, Response response, FilterChain filterChain) {
		String requestContent = request.getRequestContent();
		requestContent = requestContent.replace(":)", "haha");
		requestContent += " ----processed by FaceFilter ";
		request.setRequestContent(requestContent);

		filterChain.doFilter(request, response, filterChain);

		String responseContent = response.getResponseContent();
		response.setResponseContent(responseContent + " ----processed by FaceFilter ");
	}
}
