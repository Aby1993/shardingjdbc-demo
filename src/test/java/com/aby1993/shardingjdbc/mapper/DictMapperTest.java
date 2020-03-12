package com.aby1993.shardingjdbc.mapper;

import com.aby1993.shardingjdbc.ShardingjdbcDemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @version v1.0
 * @ProjectName: shardingjdbc-demo
 * @ClassName: DictMapperTest
 * @Description: TODO(一句话描述该类的功能)
 * @Author: Aby1993
 * @Date: 2020/3/11 17:24
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {ShardingjdbcDemoApplication.class})
public class DictMapperTest {
    @Autowired
    DictMapper mapper;

    @Test
    public void testInsert() {
        mapper.insertOrder("0",4L,"4","小学生");
    }

}
