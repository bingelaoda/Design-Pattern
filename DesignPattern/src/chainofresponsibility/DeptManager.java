package chainofresponsibility;

public class DeptManager extends Handler {

	@Override
	public String handleRequest(String user, double fee) {
		String str = "";
		
		if (fee<1000) {
			if ("张三".equals(user)) {
				str = "成功：部门经理同意【"+user+"】的聚餐费用，金额为"+fee+"元";
			}
			else {
				str = "不成功：部门经理不同意【"+user+"】的聚餐费用，金额为"+fee+"元";
			}
		}
		else {
			if (getSuccessor()!=null) {
				return getSuccessor().handleRequest(user, fee);
			}
		}
		
		
		return str;
	}

}