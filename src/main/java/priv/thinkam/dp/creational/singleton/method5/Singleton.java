package priv.thinkam.dp.creational.singleton.method5;

/**
 * 使用枚举
 * 线程安全，抗反射攻击，支持序列化，抗序列化攻击
 * 实现单例的最佳方式
 *
 * @author thinkam
 * @date 2018/02/08
 */
public enum Singleton {
	INSTSNCE;

	public void doSomething() {
		System.out.println("do something here");
	}
}
