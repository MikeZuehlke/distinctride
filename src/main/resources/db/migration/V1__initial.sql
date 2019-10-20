CREATE TABLE `tracks` (
    `id` INT(11) NOT NULL,
    `name` VARCHAR(255) NOT NULL,
    `polyline` TEXT CHARACTER SET latin1 NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;