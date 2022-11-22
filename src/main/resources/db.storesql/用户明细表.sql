DROP TABLE IF EXISTS 'user_detail'
CREATE TABLE `user_detail` (
    `id` bigint(30) NOT NULL AUTO_INCREMENT COMMENT '明细ID',
    `balance` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '当前余额',
    `oper_user_id` bigint(30) DEFAULT NULL COMMENT '操作用户ID',
    `oper_time` datetime DEFAULT NULL COMMENT '操作时间',
    `income` decimal(10,6) DEFAULT NULL COMMENT '收入',
    `expend` decimal(10,6) DEFAULT NULL COMMENT '支出',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8 COMMENT='用户明细表';