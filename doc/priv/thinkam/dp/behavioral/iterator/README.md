# 迭代器模式

- 特点
    - 提供顺序访问集合元素的方法，且不暴露集合的内部表示

- 优点
    - 支持多种方式遍历集合
    - 简化集合接口，集合省去遍历的接口
    - 同一集合可以同时有多个遍历

- 角色
    - Iterator(Iterator)
    - ConcreteIterator(ArrayListIterator, LinkedListIterator)
    - Aggregate(Collection)
    - ConcreteAggregate(ArrayList, LinkedList)

- jdk实例
    - java.util.Iterator
    - java.util.Enumeration