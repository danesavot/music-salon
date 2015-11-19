INSERT INTO credentials(username,password,enabled,authority) VALUES ('dane','dane', TRUE, 'ROLE_ADMIN');
INSERT INTO credentials(username,password,enabled,authority) VALUES ('qin','qin', TRUE , 'ROLE_ADMIN');
INSERT INTO credentials(username,password,enabled,authority) VALUES ('rishi','rishi', TRUE , 'ROLE_ADMIN');
INSERT INTO credentials(username,password,enabled,authority) VALUES ('user','user', TRUE , 'ROLE_USER');
INSERT INTO `member` (`email`, `firstName`, `lastName`, `credentials_username`) VALUES ('dane.savot@mum.edu', 'Dane', 'Savot', 'dane');
INSERT INTO `member` (`email`, `firstName`, `lastName`, `credentials_username`) VALUES ('qin@mum.edu', 'Qin', 'Qin', 'qin');
INSERT INTO `member` (`email`, `firstName`, `lastName`, `credentials_username`) VALUES ('rishi@mum.edu', 'rishi', 'rishi', 'rishi');
INSERT INTO `member` (`email`, `firstName`, `lastName`, `credentials_username`) VALUES ('user@mum.edu', 'user', 'user', 'user');



