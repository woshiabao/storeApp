package com.example.storeapp.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class Balance {

    //主键ID
    private Long ID;

    //余额
    private BigDecimal balance;

    //冻结金额
    private BigDecimal accountFrozen;

    //更新人ID
    private Long updateId;

    //更新人名称
    private String updateBy;

    //更新时间
    private LocalDateTime updateTime;

    //用户ID
    private Long userID;
}
