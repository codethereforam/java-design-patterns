# 命令模式

- 特点
    - 将请求封装为对象，从而可用不同的请求对客户参数化

- 优点
    - 把请求操作的对象和执行操作的对象分离
    - 方便设计一个请求队列
    - 方便将命令记录到日志
    - 方便实现请求撤销和重做

- 角色
    - Client(Main)
    - Invoker(ShellScript)
    - Command(Command)
    - ConcreteCommand(Pwd, Who)
    - Receiver(Shell)

- jdk实例
    - Runnable