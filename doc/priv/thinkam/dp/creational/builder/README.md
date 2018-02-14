# 建造者模式

- 特点
    - 将复杂对象的创建过程与表示分离，同样的创建过程可以有不同的表示

- 优点
    - 可以改变一个产品的内部表示
    - 将构造代码和表示代码分开
    - 可对构造过程进行更精细的控制

- 角色
    - Builder(Person)
    - ConcreteBuilder(ThinPerson, FatPerson)
    - Director(God)

- 适用场合
    - 当创建复杂对象的算法应该独立于该对象的组成部分以及它们的装配方式时
    - 当构造过程必须允许被构造的对象有不同的表示时

- jdk实例
    - java.lang.StringBuilder#append()
    - java.lang.StringBuffer#append()
    - All implementations of java.lang.Appendable



