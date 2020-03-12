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
 * @ClassName: UserMapper
 * @Description: TODO(一句话描述该类的功能)
 * @Author: Aby1993
 * @Date: 2020/3/10 16:11
 */
@Component
@Mapper
public interface UserMapper {

    @Insert("insert into t_user(user_id,fullname,user_type)values(#{userId},#{fullName},#{userType})")
    int insertUser(@Param("userId") Long  userId, @Param("fullName") String fullName, @Param("userType") String userType);


    @Select({"<script> " + "select *  from t_user t" +
            " where t.user_id in " +
            "<foreach  collection='userIds'  open='('  separator=',' close=')'  item='id' > " +
            " #{id} " + "</foreach>" + "</script>"})
    List<Map> selectUserByIds(@Param("userIds") List<Long> userIds);
}
