package chainofresponsibility.example1;

public class GeneralManager extends Handler{

	@Override
	public String handlerRequest(int fee) {
		String str = "总经理知道并同意了";
		return str;
	}
	
}
