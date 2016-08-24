package FactoryMethod;
/**
 * 工厂模式适合：凡是出现了大量的产品创建，并且具有共同的接口时，可以通过工厂模式进行创建
 * 简单的工厂模式，如果传入的字符串有误，则不能正确创建对象，静态工厂方法模式相对于多方法工厂模式
 * 不需要实例化工厂类，所以大多数情况下，我们使用静态工厂方法模式。
 * @author wuxb
 *
 */
public class SendFactory {

	/*
	 * 简单工厂模式
	 */
//	public Sender produce(String type){
//		if (type.equals("mail")) {
//			return new MailSender();
//		}
//		else if("sms".equals(type)) {
//			return new SmsSender();
//		}
//		else {
//			System.out.println("请输入正确的类型");
//			return null;
//		}
//	}
	
	/*
	 * 多工厂方法模式
	 */
//	public Sender produceMail(){
//		return new MailSender();
//	}
//	
//	public Sender produceSms(){
//		return new SmsSender();
//	}
	
	public static Sender produceMail(){
		return new MailSender();
	}
	
	public static Sender produceSms(){
		return new SmsSender();
	}
}
