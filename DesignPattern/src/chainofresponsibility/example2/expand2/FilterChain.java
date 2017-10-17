package chainofresponsibility.example2.expand2;

import java.util.ArrayList;
import java.util.List;
/**
 * 作为过滤器的一个链条，里面保存多个过滤器
 * 如果要进行过滤操作，一切由过滤器链条执行，
 * 与各种过滤器无关
 * @author Administrator
 *
 */
public class FilterChain implements Filter {
	//过滤器链里面包含所有的过滤器，可以向里面添加或者删除对应的过滤器
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
