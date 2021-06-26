# 工程简介

新建了一个用户的表单，提供对外接口对该表进行增删改查，主要的功能如下：

- 根据需求，设计用户TUser表的ER图、TUser的图，和SQL生成语句
- 创建数据库，并将`TUser.sql`插入到数据库当中
- 采用`Mybatis`，生成数据库中TUser表单对应的语句
- 设计`Service`层，该服务主要提供的功能
- 设计`Controller`层，该服务对外提供的接口
- 设计`Controller`层的统一返回标准

其中用到的技术：
- 使用`apollo`将配置文件放到云端
- 使用`Euraka`实现注册服务
- 使用`mysql`，在云服务器中部署并启用mysql服务，在该服务中配置好文件
- 使用`redis`，在云服务器中部署并启用redis服务，在该微服务中，提供Redis对应的调用接口
- 使用`RabbitMQ`, 在云服务器中部署并启用RabbitMQ服务，在微服务中，提供RabbitMQ对应的调用接口
- 使用`Mongodb`，在云服务器中部署并启用Mongodb服务，在微服务中，提供Mongodb对应的调用接口
- 使用`swagger`,实现对代码的注释
- 使用`mybatis`,实现对数据库的访问