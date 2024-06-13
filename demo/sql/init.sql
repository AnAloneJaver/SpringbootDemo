CREATE TABLE `city`
(
    `id`        bigint(20) NOT NULL AUTO_INCREMENT,
    `name_test` varchar(255)         DEFAULT NULL,
    `state`     varchar(255)         DEFAULT NULL,
    `test`      varchar(20) NOT NULL DEFAULT '0',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1010 DEFAULT CHARSET=utf8 COMMENT='市级信息'