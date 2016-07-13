package chainofResponsibility;

public interface Filter {
	void doFilter(Request request ,Respo respo,FilterChain filterChain);
}
