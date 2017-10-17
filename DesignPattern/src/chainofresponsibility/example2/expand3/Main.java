package chainofresponsibility.example2.expand3;

public class Main {
	public static void main(String[] args){
		
		//对下面一个字符串中存在的一些信息进行处理，比如说敏感信息，一些web中的信息
		String msString = "习近平，敏感，<script>";
		//request作为要处理的请求
		Request request = new Request();
		request.setRequest(msString);
		//作为处理之后的字符串有可能也会出现一些需要处理的信息，两种处理的内容可能不一样
		Response response = new Response();
		response.setResponse("response");
		
		//实例话一个FilterChain类
		
		FilterChain filterChain1  = new FilterChain();
		//装配好filterchain里面需要的filter
		filterChain1.addFilter(new HTMLFilter())
					.addFilter(new SensitiveFilter());
		
		//调用doFilter开始进行过滤，其中将filterchain自身传进去，是为了便于操作
		filterChain1.doFilter(request, response,filterChain1);
		
		System.out.println(request.getRequest());
		
		System.out.println(response.getResponse());
		
	}
}
