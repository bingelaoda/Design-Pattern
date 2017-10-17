package chainofresponsibility.example2.expand3;

public class Main {
	public static void main(String[] args){
		
		//对下面一个字符串中存在的一些信息进行处理，比如说敏感信息，一些web中的信息
		String msString = "习近平，敏感，<script>";
		
		Request request = new Request();
		request.setRequest(msString);
		Response response = new Response();
		response.setResponse("response");
		
		FilterChain filterChain1  = new FilterChain();
		
		filterChain1.addFilter(new HTMLFilter())
					.addFilter(new SensitiveFilter());
		
		
		filterChain1.doFilter(request, response,filterChain1);
		
		System.out.println(request.getRequest());
		
		System.out.println(response.getResponse());
		
	}
}
