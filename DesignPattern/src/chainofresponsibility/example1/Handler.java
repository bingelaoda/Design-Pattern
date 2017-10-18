package chainofresponsibility.example1;
/*
 * 之所以用抽象类，而不用接口，是因为这个类里面除了除了方法
 * 还有调用下一个处理者的引用
 */
public abstract class Handler {
	//保存下一个继续处理者
	protected Handler successor;

	public Handler getSuccessor() {
		return successor;
	}

	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}
	//抽象的处理请求的方法
	public abstract String handlerRequest(int fee);
}
