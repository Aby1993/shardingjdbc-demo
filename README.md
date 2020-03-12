# shardingjdbc-demo

这是一个用来学习shardingjdbc的代码，使用springboot2.0.2版本进行构建，数据库使用mysql数据库。

application_watertable.properties这个配置文件使用的是对应的水平分表，根据order_id进行对应的分表配置。

application_waterdatabase.properties 这个配置文件使用的是对应的水平分库分表的方式，根据对应的user_id 标明对应的数据是落到哪个数据库上，
再根据order_id进行分表。

application_verticality.properties  这个是垂直分库，根据业务的不同，拆分成订单库和用户库。

application.properties  暂时使用的是垂直分库  再加上对应的t_dict公共表的方式，作为一个学习使用的demo的话，还是可以的。
