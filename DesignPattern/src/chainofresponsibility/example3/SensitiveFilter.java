package chainofresponsibility.example3;

public class SensitiveFilter implements Filter {

	@Override
	public String doFilter(Request request, Response response) {
		return request.getRequest().replace("敏感", "不敏感").replace("习近平", "习大大");
	
	}
	
}
