# 装饰模式

- 特点
    - 动态地给对象添加或撤销职责、功能
    - 基本功能可排列组合形成大量的功能

- 优点
    - 将类的装饰功能从类移除，简化原有类
    - 将类的核心职责与装饰功能分离，方便重用装饰功能

- 缺点
    - 系统复杂，有很多小对象，对于多次装饰的对象排错困难

- 角色
    - 抽象构件类(Person)
    - 具体构件类(SexyGirl)
    - 抽象装饰类(DressedPerson)
    - 具体装饰类(PersonWithTshirt, PersonWithMiniSkirt)

- jdk实例
    - IO
        - 抽象构件类(InputStream)
        - 具体构件类(FileInputStream)
        - 抽象装饰类(FilterInputStream)
        - 具体装饰类(BufferedInputStream, DataInputStream)




