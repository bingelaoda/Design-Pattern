package chainofresponsibility.example1;

public class ProjectManager extends Handler {

	@Override
	public String handleRequest(String user, double fee) {

		String str = "";
		
		if (fee < 500) {
			//为了测试简单，只同意张三的请求
			if ("张三".equals(user)) {
				str = "成功：项目经理同意【"+user+"】的聚餐费用，金额为"+fee+"元";
			}
			else {
				str = "失败：项目经理不同意【"+user+"】的聚餐费用，金额为"+fee+"元";
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
