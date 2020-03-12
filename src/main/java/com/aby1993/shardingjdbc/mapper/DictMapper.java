package com.aby1993.shardingjdbc.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @version v1.0
 * @ProjectName: shardingjdbc-demo
 * @ClassName: DictMapper
 * @Description: TODO(一句话描述该类的功能)
 * @Author: Aby1993
 * @Date: 2020/3/11 17:15
 */
@Component
@Mapper
public interface DictMapper {

    @Insert("insert into t_dict(dict_id,type,code,value)values(#{dictId},#{type},#{code},#{value})")
    int insertOrder(@Param("type") String type, @Param("dictId") Long dictId, @Param("code") String code, @Param("value") String value);
}
