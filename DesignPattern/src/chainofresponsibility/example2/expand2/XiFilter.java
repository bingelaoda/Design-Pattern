package chainofresponsibility.example2.expand2;

public class XiFilter implements Filter {
	@Override
	public String doFilter(String r) {
		return r.replace("习", "xi");
	}

}
