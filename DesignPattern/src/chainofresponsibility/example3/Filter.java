package chainofresponsibility.example3;

public interface Filter {
	String doFilter(Request request,Response response);
}
