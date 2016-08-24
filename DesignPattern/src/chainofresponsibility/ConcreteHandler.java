package chainofresponsibility;
/**
 * 具体处理者角色
 * @author wuxb
 *
 */
public class ConcreteHandler extends Handler {
	/*
	 * 处理方法，调用此方法，处理请求
	 */
	@Override
	public void handleRequest() {
		/*
		 * 判断是否有后继的责任对象
		 * 如果有，就将请求转发给后继的责任对象
		 * 没有，则处理请求
		 */
		
		if (getSuccessor()!=null) {
			System.out.println("放过请求，将请求传递");
			getSuccessor().handleRequest();
		}else {
			System.out.println("处理请求");
		}
	}
	
	
	
}
