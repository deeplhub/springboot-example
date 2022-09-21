CREATE TABLE `student` (
                           `id` INT(11) NOT NULL AUTO_INCREMENT,
                           `name` VARCHAR(50) NULL DEFAULT NULL COLLATE 'latin1_swedish_ci',
                           `age` INT(11) NULL DEFAULT NULL,
                           `sex` TINYINT(1) NULL DEFAULT NULL,
                           `phone` CHAR(11) NULL DEFAULT NULL COLLATE 'latin1_swedish_ci',
                           `tel` CHAR(8) NULL DEFAULT NULL COLLATE 'latin1_swedish_ci',
                           PRIMARY KEY (`id`) USING BTREE
)
    COLLATE='latin1_swedish_ci'
ENGINE=InnoDB
AUTO_INCREMENT=4
;
