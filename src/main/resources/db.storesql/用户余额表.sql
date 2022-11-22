DROP TABLE IF EXISTS 'user_balance'
CREATE TABLE `user_balance` (
   `id` bigint(30) NOT NULL AUTO_INCREMENT COMMENT '余额ID',
   `balance` decimal(15,6) DEFAULT NULL COMMENT '余额',
   `account_frozen` decimal(10,6) DEFAULT NULL COMMENT '冻结金额',
   `update_id` bigint(30) DEFAULT NULL COMMENT '更新人ID',
   `update` varchar(100) DEFAULT NULL COMMENT '更新人名称',
   `update_time` datetime DEFAULT NULL COMMENT '更新时间',
   `user_id` bigint(30) DEFAULT NULL COMMENT '用户ID',
   PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户余额表';