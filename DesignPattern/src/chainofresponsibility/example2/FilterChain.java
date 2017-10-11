package chainofresponsibility.example2;

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
		for (Filter filter : filters) {
			r=filter.doFilter(r);
		}
		
		return r;
	}
	
}
