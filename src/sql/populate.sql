
INSERT INTO credentials(username,password,enabled,authority) VALUES ('dane','dane', TRUE, 'admin');
INSERT INTO credentials(username,password,enabled,authority) VALUES ('qin','qin', TRUE , 'admin');
INSERT INTO credentials(username,password,enabled,authority) VALUES ('user','user', TRUE , 'user');

INSERT INTO `member` (`email`, `firstName`, `lastName`, `credentials_username`) VALUES ('dane.savot@mum.edu', 'Dane', 'Savot', 'dane');
INSERT INTO `member` (`email`, `firstName`, `lastName`, `credentials_username`) VALUES ('qin@mum.edu', 'Qin', 'Qin', 'qin');
INSERT INTO `member` (`email`, `firstName`, `lastName`, `credentials_username`) VALUES ('user@gmail.com', 'User', 'User', 'user');

