package abstractFactory;

public class ConcreteFactory2 extends Factory2 {

	@Override
	IProductA getIProductA2() {
		return new ProductA2();
	}

	@Override
	IProductB getIProductB2() {
		return new ProductB2();
	}

}
