# 工厂方法模式

- 特点
    - 一个产品对应一个工厂类
    - 用于生产某种类型产品

- 优点
    - 方便添加新产品
    - 添加新产品只需添加相应工厂类，符合开闭原则

- 缺点
    - 产品多时，工厂泛滥

- 角色
    - 抽象产品(UserDAO)
    - 具体产品(UserDAOMysqlImpl & UserDAOOracleImpl)
    - 抽象工厂(UserDAOFactory)
    - 具体工厂(UserDAOFactoryMysqlImpl & UserDAOFactoryOracleImpl)

