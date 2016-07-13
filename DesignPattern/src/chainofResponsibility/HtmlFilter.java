package chainofResponsibility;

public class HtmlFilter implements Filter {

	@Override
	public void doFilter(Request request, Respo respo,FilterChain filterChain) {
		request.requeString = request.requeString.replace('<', '[')
				.replace('>', ']')+"-----HtmlFilterprocess---";
		filterChain.doFilter(request, respo, filterChain);
		respo.responString +="-----htmlFilter()----";
	}
	

}
