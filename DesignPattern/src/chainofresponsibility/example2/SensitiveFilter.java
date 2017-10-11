package chainofresponsibility.example2;

public class SensitiveFilter implements Filter {

	@Override
	public String doFilter(String msg) {
		return msg.replace("敏感", "不敏感").replace("习近平", "习大大");
	}
	
}
