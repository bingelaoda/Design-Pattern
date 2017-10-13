package chainofresponsibility.example3;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter {
	List<Filter> filters = new ArrayList<>();
	
	public FilterChain addFilter(Filter filter){
		 this.filters.add(filter);
		 
		 return this;
	}

	@Override
	public String doFilter(String r) {
	
	}

	@Override
	public String doFilter(Request request, Response response) {
		for (Filter filter : filters) {
			filter.doFilter(request,response);
		}
		
		return r;
	}
	
}
