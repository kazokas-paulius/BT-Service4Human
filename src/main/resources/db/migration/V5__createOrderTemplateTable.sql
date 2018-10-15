CREATE TABLE `order_template` (
`id` int(11) NOT NULL AUTO_INCREMENT,
`users_id` int(11) DEFAULT NULL,
`orders_id` int(11) DEFAULT NULL,
PRIMARY KEY (`id`),
FOREIGN KEY (`users_id`) REFERENCES user_data(`id`),
FOREIGN KEY (`orders_id`) REFERENCES order_data(`orders_id`)
);