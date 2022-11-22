DROP TABLE IF EXISTS 'sys_user'
CREATE TABLE `sys_user` (
    `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    `user_name` varchar(30) DEFAULT NULL COMMENT '用户账号',
    `user_password` varchar(100) DEFAULT NULL COMMENT '用户密码',
    `nick_name` varchar(30) DEFAULT NULL COMMENT '用户昵称',
    `del_flag` varchar(1) DEFAULT '0' COMMENT '删除标记(0存在1删除)',
    `status` varchar(1) NOT NULL DEFAULT 'A' COMMENT '账号状态（A正常B停用)',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户信息表';