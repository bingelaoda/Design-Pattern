package chainofresponsibility.example2.expand3;

public class HTMLFilter implements Filter{

	@Override
	public void doFilter(Request request, Response response,FilterChain filterChain) {
		String temp  = request.getRequest().replace("<", "[");
		request.setRequest(temp);
		System.out.println("HTMLrequest");
		filterChain.doFilter(request, response, filterChain);
		System.out.println("HTMLresponse");
	}
}
