package chainofresponsibility.example1;

public class ProjectManager extends Handler {

	@Override
	public String handlerRequest(int fee) {
		if (fee<300) {
			String str = "部门经理知道并同意了";
			return str;
		}else {
			return getSuccessor().handlerRequest(fee);
		}
	}

}
