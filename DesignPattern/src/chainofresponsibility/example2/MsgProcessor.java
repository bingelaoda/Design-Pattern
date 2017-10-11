package chainofresponsibility.example2;

public class MsgProcessor {
	
	String msgString;
	Filter[] filters ={new HTMLFilter(),new SensitiveFilter()};
	public String doProcess(){
		String r=msgString;
		for (Filter filter:filters) {
			r = filter.doFilter(r);
		}
		
		return r;
	}
	
	public String getMsgString() {
		return msgString;
	}

	public void setMsgString(String msgString) {
		this.msgString = msgString;
	}
	
}
