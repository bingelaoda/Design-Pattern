package abstractFactory;

public class Client {

	public static void main(String[] args){
		Factory1 factory1 = new ConcreteFactory1();
		IProductA productA1 = factory1.getProductA1();
		IProductB productB1 = factory1.getProductB1();
		
		productA1.method();
		//nihao
		productB1.method();
		
		Factory2 factory2 = new ConcreteFactory2();
		IProductA productA2 = factory2.getIProductA2();
		IProductB productB2 = factory2.getIProductB2();
		
		productA2.method();
		productB2.method();
		
	}
}
