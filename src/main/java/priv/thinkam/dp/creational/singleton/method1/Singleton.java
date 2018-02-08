package priv.thinkam.dp.creational.singleton.method1;

/**
 * 饿汉式
 * 类加载是实例化对象，若暂时用不到该对象，则占用系统资源
 *
 * @author thinkam
 * @date 2018/02/08
 */
public class Singleton {
	private static boolean first = true;
	private static Singleton instance = new Singleton();

	private Singleton() {
		//防止反射攻击
		synchronized (this) {
			if (first) {
				first = !first;
			} else {
				throw new RuntimeException("constructor can not be accessed");
			}
		}
	}

	public static Singleton getInstance() {
		return instance;
	}

}
