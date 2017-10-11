package chainofresponsibility.example1;
//客户端类
public class Client {

	public static void main(String[] args){
//		//组装责任链
//		Handler handler1 = new ConcreteHandler();
//		Handler handler2 = new ConcreteHandler();
//		handler1.setSuccessor(handler2);
//		
//		//提交请求
//		handler1.handleRequest();
		
		Handler h1 = new GeneralManager();
		Handler h2 = new DeptManager();
		Handler h3 = new ProjectManager();
		
		h3.setSuccessor(h2);
		h2.setSuccessor(h1);
		
		String test1 = h3.handleRequest("张三", 1020);
		System.out.println(test1);
	}
}
