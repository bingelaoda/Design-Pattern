package chainofresponsibility.example2.expand3;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter {
	List<Filter> filters = new ArrayList<>();
	
	public FilterChain addFilter(Filter filter){
		 this.filters.add(filter);
		 
		 return this;
	}
	int index=0;
	@Override
	public void doFilter(Request request, Response response,FilterChain filterChain) {
		if (index!=filters.size()) {
			filters.get(index).doFilter(request, response,filterChain);
		}
	}
}
