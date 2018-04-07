package priv.thinkam.dp.creational.singleton.method2;

/**
 * 使用同步方法，保证了线程安全，但性能差
 *
 * @author thinkam
 * @date 2018/02/08
 */
public class Singleton {
	private static boolean first = true;
	private static Singleton instance;

	private Singleton() {
		//防止反射攻击
		synchronized (this) {
			if(first) {
				first = !first;
			} else {
				throw new AssertionError("constructor can not be accessed");
			}
		}
	}

	public static synchronized Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
