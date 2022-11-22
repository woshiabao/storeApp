package com.example.storeapp.mapper;

import com.example.storeapp.entity.Detail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Mapper
@Repository
public interface ApiMapper {

    //查询用户钱包余额
    BigDecimal findById(@Param("id") Long id);

    //用户余额变动(消费100元,退款20元)
    Integer updateByConsume(BigDecimal blance,Long id);

    //新增明细
    Integer insertByConsume(BigDecimal consume, Long id, BigDecimal blance);

    //查询用户钱包金额变动明细
    List<Detail> findDetail(@Param("id") Long id);
}
