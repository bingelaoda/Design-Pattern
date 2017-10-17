package chainofresponsibility.example2.expand2;

public class MsgProcessor {
	//通过filterchain处理各种过滤操作
	FilterChain fChain;
	String msString;
	
	public String doProcess(){
		return fChain.doFilter(msString);
	}
	
	
	public String getMsString() {
		return msString;
	}

	public void setMsString(String msString) {
		this.msString = msString;
	}

	public FilterChain getfChain() {
		return fChain;
	}

	public void setfChain(FilterChain fChain) {
		this.fChain = fChain;
	}
	
}
