# 模板方法模式

- 特点
    - 定义一个算法骨架，将一些步骤延迟到子类实现

- 优点
    - 去除子类重复代码

- 角色
    - 抽象模板(AbstractClass)
    - 具体模板(ConcreteClassA, ConcreteClassB)

- jdk实例
    - java.util.AbstractList, java.util.AbstractSet, java.util.AbstractMap
    - javax.servlet.http.HttpServlet