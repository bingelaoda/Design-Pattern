package chainofresponsibility.example2;

public class HTMLFilter implements Filter{

	@Override
	public String doFilter(String msg) {
		return msg.replace("<", "[");
	}
}
