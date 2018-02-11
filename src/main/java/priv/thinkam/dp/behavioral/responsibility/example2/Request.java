package priv.thinkam.dp.behavioral.responsibility.example2;

/**
 * @author thinkam
 * @date 2018/02/11
 */
public class Request {
	private String requestContent;

	public Request(String requestContent) {
		this.requestContent = requestContent;
	}

	public String getRequestContent() {
		return requestContent;
	}

	public void setRequestContent(String requestContent) {
		this.requestContent = requestContent;
	}
}
