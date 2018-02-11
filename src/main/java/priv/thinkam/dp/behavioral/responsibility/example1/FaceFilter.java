package priv.thinkam.dp.behavioral.responsibility.example1;

/**
 * @author thinkam
 * @date 2018/02/11
 */
public class FaceFilter implements Filter {

	@Override
	public String doFilter(String string) {
		return string.replace(":)", "haha");
	}
}
