package FactoryMethod;

public class FactoryTest {
	public static void main(String[] args){
//		SendFactory sendFactory = new SendFactory();
		/*
		 * 简单工厂模式
		 */
//		Sender sender = sendFactory.produce("sms");
		
		/*
		 * 多工厂方法模式
		 */
//		Sender sender = sendFactory.produceMail();
//		sender.send();
		Sender sender = SendFactory.produceMail();
		sender.send();
	}
}
