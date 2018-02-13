# 职责链模式

- 特点
    - 使多个对象有机会处理请求，从而避免请求发送者和接受者间的耦合
    - 将对象处理连成一条链，沿着这条链传递请求，直到被处理

- 优点
    - 降低耦合
    - 增强对象指派职责的灵活性

- 缺点
    - 不能保证请求会被处理

- 适用场合
    - 有多个的对象可以处理一个请求，哪个对象处理该请求运行时刻自动确定
    - 你想在不明确指定接收者的情况下，向多个对象中的一个提交一个请求
    - 可处理一个请求的对象集合应被动态指定

- 角色(example3)
    - Handle(Logger)
    - ConcreteHandler(StdoutHandler, EmailHandler, ErrorHandler)
    - Client(Main)

- jdk实例
    - javax.servlet.Filter#doFilter()
    - java.util.logging.Logger#log()
