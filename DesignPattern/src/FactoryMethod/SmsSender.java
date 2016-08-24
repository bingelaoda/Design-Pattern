package FactoryMethod;

public class SmsSender implements Sender{

	@Override
	public void send() {
		System.out.println("this is SmsSender!");
	}
}
