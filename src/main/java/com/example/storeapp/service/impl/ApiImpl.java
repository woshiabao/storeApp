package com.example.storeapp.service.impl;

import com.example.storeapp.entity.Detail;
import com.example.storeapp.mapper.ApiMapper;
import com.example.storeapp.service.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ApiImpl implements Api {

    @Autowired
    ApiMapper apiMapper;

    //查询用户钱包余额
    @Override
    public BigDecimal selectBlance(Long id){
        return apiMapper.findById(id);
    }

    //用户余额变动(消费100元,退款20元)
    @Override
    public Integer update(BigDecimal blance,Long id){
        return apiMapper.updateByConsume(blance,id);
    }

    //明细
    @Override
    public Integer insert(BigDecimal consume, Long id, BigDecimal blance) {
        return apiMapper.insertByConsume(consume,id,blance);
    }

    @Override
    public List<Detail> selectDetail(Long id) {
        return apiMapper.findDetail(id);
    }
}
