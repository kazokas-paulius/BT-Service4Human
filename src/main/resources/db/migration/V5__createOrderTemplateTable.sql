CREATE TABLE `order_template` (
`id` int(11) NOT NULL AUTO_INCREMENT,
`users_id` int(11) DEFAULT NULL,
`orders_id` int(11) DEFAULT NULL,
`user_username` varchar(255) DEFAULT NULL,
`translator` varchar(255) DEFAULT NULL,
`language_from` varchar(255) DEFAULT NULL,
`language_to` varchar(255) DEFAULT NULL,
`order_date` date DEFAULT NULL,
`estimated_date` date DEFAULT NULL,
`price_hour` float(10) DEFAULT NULL,
PRIMARY KEY (`id`),
FOREIGN KEY (`users_id`) REFERENCES user_data(`id`),
FOREIGN KEY (`orders_id`) REFERENCES order_data(`orders_id`)
);