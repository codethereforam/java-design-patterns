# 单例模式

- 特点
    - 保证对象只有一个实例，并提供一个全局访问点

- 需要考虑
    - 是否需要懒加载
    - 线程安全
    - 反射攻击
    - 是否需要支持序列化
        - 若需要，考虑序列化攻击

- 方案
    - 使用枚举(最佳方式, method5)
        - 支持序列化
        - 线程安全
        - 抗反射攻击
        - 抗序列化攻击
    - 使用内部类(method4)
    - 双重同步锁(method3)
        - 相对使用同步方法，性能较高
    - 使用同步方法(method2)
        - 保证了线程安全，但性能差
    - 饿汉式(method1)
        - 类加载时实例化对象
        - 若暂时用不到该对象，则占用系统资源

- 支持序列化
    - 使用枚举（本身支持）
    - 其他(参考method4a)
        - 添加`implements Serializable`
        - 添加`readResolve()`方法，以防止序列化攻击

- jdk实例
    - java.lang.Runtime#getRuntime()
    - java.lang.System#getSecurityManager()

- 参考
    - Effective Java

