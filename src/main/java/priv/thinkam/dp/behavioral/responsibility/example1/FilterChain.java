package priv.thinkam.dp.behavioral.responsibility.example1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author thinkam
 * @date 2018/02/11
 */
public class FilterChain implements Filter {
	private List<Filter> filters = new ArrayList<>();

	public FilterChain addFilter(Filter filter) {
		filters.add(filter);
		return this;
	}

	@Override
	public String doFilter(String string) {
		for(Filter filter : filters) {
			string = filter.doFilter(string);
		}
		return string;
	}
}
