package chainofresponsibility.example2;

public class MsgProcessor {
	
	String msgString;
	Filter[] filters ={new HTMLFilter(),new SensitiveFilter()};
	
	public String doProcess(){
		String rString = msgString;
		for (Filter filter : filters) {
			rString=filter.doFilter(rString);
		}
		
		return rString;
		
	}
	
	public String getMsgString() {
		return msgString;
	}

	public void setMsgString(String msgString) {
		this.msgString = msgString;
	}
	
}
