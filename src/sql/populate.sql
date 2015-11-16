
INSERT INTO credentials(username,password,enabled,authority) VALUES ('dane','dane', TRUE, 'freelancer');
INSERT INTO credentials(username,password,enabled,authority) VALUES ('msamy','msamy', TRUE , 'freelancer');
INSERT INTO credentials(username,password,enabled,authority) VALUES ('gene','gene', TRUE , 'freelancer');

INSERT INTO `cremacafe`.`member` (`email`, `firstName`, `lastName`, `credentials_username`) VALUES ('dane.savot@mum.edu', 'Dane', 'Savot', 'dane');
INSERT INTO `cremacafe`.`member` (`email`, `firstName`, `lastName`, `credentials_username`) VALUES ('msamy@sufigeeks.org', 'Mohamed', 'Samy', 'msamy');
INSERT INTO `cremacafe`.`member` (`email`, `firstName`, `lastName`, `credentials_username`) VALUES ('YevheniyRohozhnikov@gmail.com', 'Yevheniy', 'Rohozhnikov', 'gene');

INSERT INTO `cremacafe`.`freelancer` (`description`, `rate`, `skills`, `title`, `member_id`) VALUES ('About 15 years in software development, experience of work', '22', 'Java, Android SDK, Android Query', 'Android Mobile Developer', '1');
INSERT INTO `cremacafe`.`freelancer` (`description`, `rate`, `skills`, `title`, `member_id`) VALUES ('About 15 years in software development, experience of work', '22', 'Java, Android SDK, Android Query', 'Android Mobile Developer', '2');
INSERT INTO `cremacafe`.`freelancer` (`description`, `rate`, `skills`, `title`, `member_id`) VALUES ('About 15 years in software development, experience of work', '22', 'Java, Android SDK, Android Query', 'Android Mobile Developer', '3');
