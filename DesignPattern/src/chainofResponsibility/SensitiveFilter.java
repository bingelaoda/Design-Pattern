package chainofResponsibility;

public class SensitiveFilter implements Filter {

	@Override
	public void doFilter(Request request, Respo respo,FilterChain filterChain) {
		request.requeString = request.requeString.replace("老师", "学生")+"-----senfilterprocess-";
		filterChain.doFilter(request, respo, filterChain);
		respo.responString+="-----SensitiveFilter()-----";
	}

}
