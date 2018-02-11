package priv.thinkam.dp.behavioral.responsibility.example2;

/**
 * @author thinkam
 * @date 2018/02/11
 */
public class Response {
	private String responseContent;

	public String getResponseContent() {
		return responseContent;
	}

	public void setResponseContent(String responseContent) {
		this.responseContent = responseContent;
	}

	public Response(String responseContent) {
		this.responseContent = responseContent;
	}
}
