package Singleton;


/*
 * 1、创建类比较繁琐，对于一些大型的对象，这是一笔很大的开销。
 * 2、省去了new操作符，降低了系统内存的使用频率，减轻GC的压力；
 * 3、有些类，例如交易所的核心交易引擎，控制着交易流程，如果该类可以创建多个的话，系统就乱了。所以只有使用单例模式
 * 才能保证核心交易服务器独立控制着整个流程。
 */
public class Singleton {

	/*
	 * 持有私有静态实例，防止被引用，
	 * 此处赋值为null,目的是实现延迟加载
	 */
	private static Singleton instance  = null;
	
	/*
	 * 私有构造方法
	 */
	private  Singleton(){
		
	}
	/*
	 * 静态工程方法，创建实例
	 */
//	public static Singleton getInstance(){
/*	public static synchronized Singleton getInstance(){
		if (instance==null) {
			instance = new Singleton();
		}
		
		return instance;
	}*/
	public static  Singleton getInstance(){
		if (instance==null) {
			synchronized (instance) {
				instance = new Singleton();
			}
		}
		return instance;
	}
	/*
	 * 上面的程序，以A、B两个线程为例，
	 * A线程进入synchronized部分，发现instance为null，执行instance = new Singleton();
	 * 由于JVM内部的优化机制，JVM先画出了一些分配给Singleton实例的空白内存，并赋值给instance成员（
	 * 注意此时JVM没有开始初始化这个实例），然后A离开了syschronized块。
	 * B进入synchronized块，由于此时instance不是null，因此它马上离开并且将结果返回给调用它的程序。
	 * 此时B线程打算使用Singleton实例，却发现它没有被初始化，错误发生
	 */
	
	public Object readResolve(){
		return instance;
	}
	
}
