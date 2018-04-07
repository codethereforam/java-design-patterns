package priv.thinkam.dp.creational.singleton.method4a;

import java.io.Serializable;

/**
 * 使用内部类，并实现序列化
 *
 * @author thinkam
 * @date 2018/02/08
 */
public class Singleton implements Serializable {
	private static boolean first = true;

	private Singleton() {
		synchronized (this) {
			if (first) {
				first = !first;
			} else {
				throw new AssertionError("constructor can not be accessed");
			}
		}
	}

	public static Singleton getInstance() {
		return InnerClass.instance;
	}

	/**
	 * 防止序列化攻击
	 *
	 * @return the instance of InnerClass
	 */
	private Object readResolve() {
		return InnerClass.instance;
	}

	private static class InnerClass {
		private static Singleton instance = new Singleton();
	}
}
