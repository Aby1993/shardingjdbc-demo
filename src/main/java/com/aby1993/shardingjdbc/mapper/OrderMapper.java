package com.aby1993.shardingjdbc.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * @version v1.0
 * @ProjectName: shardingjdbc-demo
 * @ClassName: OrderMapper
 * @Description: TODO(一句话描述该类的功能)
 * @Author: Aby1993
 * @Date: 2020/3/9 20:12
 */
@Component
@Mapper
public interface OrderMapper {

    @Insert("insert into t_order(price,user_id,status)values(#{price},#{userId},#{status})")
    int insertOrder(@Param("price") BigDecimal price, @Param("userId") Long userId, @Param("status") String status);


    @Select({"<script> " + "select *  from t_order t" +
            " where t.order_id in " +
            "<foreach  collection='orderIds'  open='('  separator=',' close=')'  item='id' > " +
            " #{id} " + "</foreach>" + "</script>"})
    List<Map> selectOrderByIds(@Param("orderIds") List<Long> orderIds);


    @Select({"<script> " + "select *  from t_order t" +
            " where t.order_id in " +
            "<foreach  collection='orderIds'  open='('  separator=',' close=')'  item='id' > " +
            " #{id} " + "</foreach>   and user_id=1" + "</script>"})
    List<Map> selectOrderByUserAndIds(@Param("orderIds") List<Long> orderIds);
}
