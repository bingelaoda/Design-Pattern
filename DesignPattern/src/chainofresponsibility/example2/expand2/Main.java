package chainofresponsibility.example2.expand2;

public class Main {
	public static void main(String[] args){
		
		//对下面一个字符串中存在的一些信息进行处理，比如说敏感信息，一些web中的信息
		String msString = "习近平，敏感，<script>;";
		
		MsgProcessor msgProcessor = new MsgProcessor();
		msgProcessor.setMsString(msString);
		
		FilterChain filterChain = new FilterChain();
		filterChain.addFilter(new HTMLFilter())
				   .addFilter(new SensitiveFilter());
		FilterChain filterChain2 = new FilterChain();
		filterChain2.addFilter(new FaceFilter())
					.addFilter(new XiFilter());
		
		filterChain.addFilter(filterChain2);
		
		//将合并后的filterchain装配到msgProcessor里面
		msgProcessor.setfChain(filterChain);
		String str = msgProcessor.doProcess();
		
		System.out.println(str);
		
	}
}
