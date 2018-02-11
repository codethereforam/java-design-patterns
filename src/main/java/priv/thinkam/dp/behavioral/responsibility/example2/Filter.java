package priv.thinkam.dp.behavioral.responsibility.example2;

/**
 * @author thinkam
 * @date 2018/02/11
 */
public interface Filter {
	void doFilter(Request request, Response response, FilterChain filterChain);
}
