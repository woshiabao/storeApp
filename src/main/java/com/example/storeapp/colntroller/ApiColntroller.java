package com.example.storeapp.colntroller;

import com.example.storeapp.result.Result;
import com.example.storeapp.service.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;


@Controller
@RequestMapping("/api")
public class ApiColntroller {

    @Autowired
    private Api api;

    //查询用户钱包余额
    @GetMapping("/query")
    @ResponseBody
    public Result queryInfo(@RequestParam("id") Long id){
        String blance = api.selectBlance(id).toString();
        return Result.ok(blance);
    }

    //用户消费100元
    @PostMapping("/uodateConsume")
    @ResponseBody
    @Transactional
    public Result uodateConsume(@RequestParam("id") Long id){

        if (api.selectBlance(id).doubleValue()>100){
            //消费金额
            BigDecimal consume = new BigDecimal(-100.00).setScale(6,BigDecimal.ROUND_HALF_UP);
            BigDecimal blance = api.selectBlance(id).add(consume);
            if (api.insert(consume,id,blance)>0){
                return Result.ok(api.update(blance,id));
            }else {
                return Result.fail();
            }
        }else {
            return Result.notmoney();
        }

    }

    //用户退款20元接口
    @PostMapping("/uodateRefund")
    @ResponseBody
    @Transactional
    public Result uodateRefund(@RequestParam("id") Long id){
        //退款金额
        BigDecimal consume = new BigDecimal(20.00);
        BigDecimal blance = api.selectBlance(id).add(consume);
        if (api.insert(consume,id,blance)>0){
            return Result.ok(api.update(blance,id));
        }else {
            return Result.fail();
        }
    }

    //查询用户钱包金额变动明细
    @GetMapping("/list")
    @ResponseBody
    public Result list(@RequestParam("id") Long id){
        return Result.ok(api.selectDetail(id));
    }

}
