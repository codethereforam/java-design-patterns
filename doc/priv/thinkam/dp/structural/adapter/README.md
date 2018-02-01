# 适配器模式

- 特点
    - 将一个类的接口转换为客户期望的另一个类的接口

- 优点
    - 将目标类与适配者类解耦，引入适配器，从而无需修改源码
    - 提高适配者的复用性

- 角色
    - target(Duck)
    - adapter(TurkeyAdapter)
    - adaptee(WildTurkey)
    - client(Main)

- 实例
    - jdk
        - Enumeration, Iterator
        - InputStream, InputStreamReader, Reader
    - other
        - JDBC/ODBC Bridge
        - wine
        - 变压器

- 适用场合
    - 小接口不统一时，及时重构；无法改变已有代码时，用适配器模式


