package chainofResponsibility;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter{
	List<Filter> filters = new ArrayList<>();
	int index=0;
	public FilterChain addFilter(Filter f){
		this.filters.add(f);
		return this; 
	}
	
	@Override
	public void doFilter(Request request, Respo respo,FilterChain filterChain) {
		if(index==filters.size()) return ;
		Filter filter = filters.get(index);
		index++;
		filter.doFilter(request, respo,filterChain);
	}
}
