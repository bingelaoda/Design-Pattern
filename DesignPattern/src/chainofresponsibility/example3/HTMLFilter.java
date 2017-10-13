package chainofresponsibility.example3;

public class HTMLFilter implements Filter{

	@Override
	public String doFilter(Request request, Response response) {
		return request.getRequest().replace("<", "[");
	}
}
