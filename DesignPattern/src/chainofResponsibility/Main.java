package chainofResponsibility;

public class Main {

	public static void main(String[] args){
		String msc = "hello ,<script>我是老师，我不怕死,我爱中国...,!";
		Request request = new Request();
		request.setRequeString(msc);
		Respo respo = new Respo();
		respo.setResponString("response");
		FilterChain fc = new FilterChain();
		fc.addFilter(new HtmlFilter()).
			addFilter(new SensitiveFilter());
		FilterChain fc2= new FilterChain();
		fc.doFilter(request, respo,fc);
		System.out.println(request.getRequeString());
		System.out.println(respo.getResponString());
	}
	
}
