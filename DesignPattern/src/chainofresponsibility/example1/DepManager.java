package chainofresponsibility.example1;

public class DepManager extends Handler {

	@Override
	public String handlerRequest(int fee) {
		if (fee<500) {
			String str = "部门经理知道并同意了";
			return str;
		}else {
			return getSuccessor().handlerRequest(fee);
		}
	}

}
