package priv.thinkam.dp.creational.singleton.method1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author thinkam
 * @date 2018/02/08
 */
public class Main {
	public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance1 == instance2);

		//反射攻击
		Class<?> classType = Singleton.class;
		Constructor<?> c = classType.getDeclaredConstructor();
		c.setAccessible(true);
		Singleton instance3 = (Singleton) c.newInstance();
		System.out.println(instance1 == instance3);
	}
}
