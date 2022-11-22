package com.example.storeapp.service;



import com.example.storeapp.entity.Detail;

import java.math.BigDecimal;
import java.util.List;

public interface Api {

    //查询用户钱包余额
    BigDecimal selectBlance(Long id);

    //用户余额变动(消费100元,退款20元)
    Integer update(BigDecimal blance,Long id);

    //明细
    Integer insert(BigDecimal consume,Long id,BigDecimal blance);

    //查询用户钱包金额变动明细
    List<Detail> selectDetail(Long id);
}
