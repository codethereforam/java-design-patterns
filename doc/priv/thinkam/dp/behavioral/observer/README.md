# 观察者模式

- 特点
    - 多个观察者监听某一主题, 当主题对象发生变化时通知所有观察者对象, 并使它们自动更新

- 优点
    - 主题和观察者间松耦合
    - 支持广播通信

- 缺点
    - 如果主题有很多观察者,则通知时间可能较长
    - 如果观察者间有循环依赖, 系统易崩溃
    - 如果一个观察者不知道其他观察者的存在, 可能导致意外的更新

- 角色
    - Subject(Component)
    - ConcreteSubject(Button)
    - Observer(MouseListener)
    - ConcreteObserver(Main中匿名监听器类)

- jdk实例
    - java.util.Observer, java.util.Observable
    - awt event model