# 抽象工厂模式(example1)

- 特点
    - 用于生产一系列产品

- 优点
    - 易于改变工厂生产行为，产生新的产品系列
    - 具体创建过程与客户端分离，客户端通过接口操纵实例（factory1.createUserDAO().add()）

- 缺点
    - 添加新产品，要修改抽象工厂接口、具体工厂，改动太多

- 角色
    - 抽象产品(UserDAO & LogDAO)
    - 具体产品(UserDAOMysqlImpl & UserDAOOracleImpl & LogDAOMysqlImpl & LogDAOOracleImpl)
    - 抽象工厂(DAOFactory)
    - 具体工厂(DAOFactoryMysqlImpl & DAOFactoryOracleImpl)

# 用简单工厂改进抽象工厂(example2)

- 特点
    - 用DataAccess取代抽象工厂和具体工厂
    - DataAccess通过判断控制生产行为

- 优点
    - 减少类

- 缺点
    - 添加新产品系列，要改动DataAccess中的switch-case

# 用反射改进抽象工厂(example3)

- 优点
    - 减少类
    - 解决抽象工厂添加产品改动较多的问题，方便扩展

- 可使用配置文件继续完善
