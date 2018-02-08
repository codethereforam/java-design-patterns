package priv.thinkam.dp.creational.singleton.method3;

/**
 * 双重同步锁
 * 相对使用同步方法，性能较高
 *
 * @author thinkam
 * @date 2018/02/08
 */
public class Singleton {
	private static boolean first = true;
	private static volatile Singleton instance;

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
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}
