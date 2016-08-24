package abstractFactory;
/*
 * 不同的厂商负责本公司的产品生产
 */
public abstract class Factory1 {
	abstract IProductA getProductA1();
	abstract IProductB getProductB1();
}
