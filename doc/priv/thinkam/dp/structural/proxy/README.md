# 代理模式

- 特点
    - 为其他对象提供一种代理以控制其访问

- 角色
    - Subject(定义RealSubject 和Proxy的共用接口) -- Browsable
    - Proxy(保存一个引用使得代理可以访问实体) -- ProxySoftware
    - RealSubject(定义Proxy所代表的实体) -- Browser

- 实例
    - jdk实例
        - java.lang.reflect: Proxy, InvocationHandler, Method
        - RMI
    - other
        - 快捷方式
        - Internet censorship circumvention
        - Spring AOP

- 常见情景
    - 智能指引：调用真实对象时代理处理其他事，例如事务，日志，检查权限
    - 远程代理：为一个对象在不同的地址空间提供局部代表
    - 虚代理：根据需要创建开销很大的对象
    - 保护代理：控制对原始对象的访问

- 分类
    - 静态代理
        - 继承
        - 聚合
    - 动态代理
        - jdk代理
        - cglib库



