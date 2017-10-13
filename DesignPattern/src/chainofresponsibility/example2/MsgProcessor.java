package chainofresponsibility.example2;

public class MsgProcessor {
	
	String msgString;
//	Filter[] filters ={new HTMLFilter(),new SensitiveFilter()};
	
	FilterChain fChain ;
	
	public FilterChain getfChain() {
		return fChain;
	}

	public void setfChain(FilterChain fChain) {
		this.fChain = fChain;
	}

	public String doProcess(){
		return fChain.doFilter(msgString);
	}
	
	public String getMsgString() {
		return msgString;
	}

	public void setMsgString(String msgString) {
		this.msgString = msgString;
	}
	
}
