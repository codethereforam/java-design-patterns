package priv.thinkam.dp.behavioral.responsibility.example2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author thinkam
 * @date 2018/02/11
 */
public class FilterChain {
	private List<Filter> filters = new ArrayList<>();
	private int index;

	public FilterChain addFilter(Filter filter) {
		filters.add(filter);
		return this;
	}

	public void doFilter(Request request, Response response, FilterChain filterChain) {
		if(index == filters.size()) {
			return;
		}

		Filter filter = filters.get(index);
		index++;
		filter.doFilter(request, response, filterChain);
	}
}
