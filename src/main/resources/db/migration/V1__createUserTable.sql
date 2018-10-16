CREATE TABLE `user_data` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `firstname` varchar(255) DEFAULT NULL,
  `lastname` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `phone` int(9) DEFAULT NULL,
  `target_text` varchar(4000) DEFAULT NULL,
  `comment` varchar(255) DEFAULT NULL,
  `ratting` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
);
