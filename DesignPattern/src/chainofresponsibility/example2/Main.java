package chainofresponsibility.example2;

public class Main {
	public static void main(String[] args){
		
		//对下面一个字符串中存在的一些信息进行处理，比如说敏感信息，一些web中的信息
		String msString = "习近平，敏感，<script>";
		
		MsgProcessor msgProcessor = new MsgProcessor();
		
		msgProcessor.setMsgString(msString);
		
		String str = msgProcessor.doProcess();
		
		System.out.println(str);
		
	}
}
