package chainofresponsibility.example2.expand3;

public class SensitiveFilter implements Filter {

	@Override
	public void doFilter(Request request, Response response,FilterChain filterChain) {
		String  temp = request.getRequest().replace("敏感", "不敏感").replace("习近平", "习大大");
		request.setRequest(temp);
		System.out.println("Sentirequest");
		System.out.println("Sentiresponse");
	}
	
}
