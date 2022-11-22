package com.example.storeapp.entity;

import lombok.Data;

@Data
public class User {

    //主键ID
    private Long id;

    //用户账号
    private String userName;

    //用户密码
    private String userPassword;

    //用户昵称
    private String nickName;

    //删除标记(0存在1删除)
    private String delFlag;

    //账号状态（A正常B停用)
    private String status;
}
