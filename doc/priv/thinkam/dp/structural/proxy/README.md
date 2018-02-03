# 代理模式

- 特点
    - 为其他对象提供一种代理以控制其访问

- 角色
    - Subject(定义RealSubject 和Proxy的共用接口) -- Browsable
    - Proxy(保存一个引用使得代理可以访问实体) -- Browser
    - RealSubject(定义Proxy所代表的实体) -- ProxySoftware

- 实例
    - jdk实例
        - java.lang.reflect: Proxy, InvocationHandler, Method
        - RMI
    - other
        - 快捷方式
        - Internet censorship circumvention

- 常见情景
    - 远程代理：为一个对象在不同的地址空间提供局部代表
    - 虚代理：根据需要创建开销很大的对象
    - 保护代理：控制对原始对象的访问
    - 智能指引：取代了简单的指针，它在访问对象时执行一些附加操作



