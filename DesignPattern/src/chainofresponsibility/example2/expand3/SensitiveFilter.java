package chainofresponsibility.example2.expand3;

public class SensitiveFilter implements Filter {

	@Override
	public void doFilter(Request request, Response response,FilterChain filterChain) {
		filterChain.index++;
		String  temp = request.getRequest().replace("敏感", "不敏感").replace("习近平", "习大大");
		request.setRequest(temp+"Sentirequest");
		filterChain.doFilter(request, response, filterChain);
		response.setResponse(response.getResponse()+"Sentiresponse");
	}
	
}
