# 组合模式

- 特点
    - 将对象组合成树形结构以表示“部分-整体”的层次结构
    - Composite使得用户对单个对象和组合对象的使用具有一致性

- 种类
    - 透明方式
        - Component包括add(), remove()
    - 安全方式
        - Component不包括add(), remove()

- 优点
    - 客户端可以一致地使用叶节点和组合对象
    - 容易添加新种类的构件

- 适用场景
    - 想表示对象的“部分-整体”的层次结构
    - 希望用户忽略组合对象与单个对象的不同, 用户将统一地使用组合结构中的所有对象

- 角色
    - Component(Graphic)
    - Leaf(Line, Point)
    - Composite(Picture)




