package com.aby1993.shardingjdbc.mapper;

import com.aby1993.shardingjdbc.ShardingjdbcDemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @version v1.0
 * @ProjectName: shardingjdbc-demo
 * @ClassName: OrderMapperTest
 * @Description: TODO(一句话描述该类的功能)
 * @Author: Aby1993
 * @Date: 2020/3/9 20:18
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {ShardingjdbcDemoApplication.class})
public class UserMapperTest {

    @Autowired
    UserMapper mapper;

    @Test
    public void testInsert() {
        for (int i = 0; i < 20; i++) {
            mapper.insertUser(i + 1L, "ZHANGSAN", "0");
        }
    }

    @Test
    public void testselectUserByIds() {

        List list = new ArrayList();

        //如果两条都是同一个表中  则一条实际的sql语句
        //如果两条不是同一个表中  则2条实际的sql语句
        list.add(1);
        list.add(3);
        mapper.selectUserByIds(list);
    }

}
