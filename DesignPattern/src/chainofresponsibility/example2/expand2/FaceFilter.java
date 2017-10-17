package chainofresponsibility.example2.expand2;

public class FaceFilter implements Filter{

	@Override
	public String doFilter(String r) {
		r = r.replace(";","^V^");
		return r;
	}

}
