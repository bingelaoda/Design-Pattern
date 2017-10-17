package chainofresponsibility.example2.expand3;

public class SensitiveFilter implements Filter {

	@Override
	public void doFilter(Request request, Response response,FilterChain filterChain) {
		filterChain.index++;
		String  temp = request.getRequest().replace("敏感", "不敏感").replace("习近平", "习大大");
		request.setRequest(temp+"Sentirequest");
		
		//调用这一个doFilter是为了调用实例化的下一个filter,一次递归调用
		filterChain.doFilter(request, response, filterChain);
		response.setResponse(response.getResponse()+"Sentiresponse");
	}
	
}
