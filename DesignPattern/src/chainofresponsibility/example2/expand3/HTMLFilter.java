package chainofresponsibility.example2.expand3;

public class HTMLFilter implements Filter{

	@Override
	public void doFilter(Request request, Response response,FilterChain filterChain) {
		filterChain.index++;
		String temp  = request.getRequest().replace("<", "[");
		request.setRequest(temp+"HTMLrequest");
		filterChain.doFilter(request, response, filterChain);
		response.setResponse(response.getResponse()+"HTMLresponse");
	}
}
