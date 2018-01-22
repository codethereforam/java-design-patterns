# 简单工厂模式（静态工厂方法模式）

- 特点
    - 工厂类包含必要的逻辑判断来选择生产具体产品
    - 用于生产单个产品

- 优点
    - 去除客户端与具体产品的依赖

- 缺点
    - 添加产品需要修改工厂类，违背开闭原则

- 角色
    - 抽象产品(UserDAO)
    - 具体产品(UserDAOMysqlImpl & UserDAOOracleImpl)
    - 工厂(UserDAOFactory)


