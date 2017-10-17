package chainofresponsibility.example2.expand3;

public interface Filter {
	void doFilter(Request request,Response response,FilterChain filterChain);
}
