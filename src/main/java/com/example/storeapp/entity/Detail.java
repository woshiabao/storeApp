package com.example.storeapp.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class Detail {

    //主键id
    private Long id;

    //当前余额
    private String balance;

    //操作用户ID
    private Long operUserId;

    //操作时间
    private LocalDateTime operTime;

    //收入
    private BigDecimal income;

    //支出
    private BigDecimal expend;

}
