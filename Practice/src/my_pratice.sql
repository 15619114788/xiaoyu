drop database if exists	my_pratice;
create database my_pratice;
use my_pratice;
drop table ty if exists;
create table ty(
	userid int(11) PRIMARY KEY AUTO_INCREMENT not null,
	username VARCHAR(255) NOT NULL,
	userpwd varchar(255) not null 
)ENGINE=INNODB CHARSET=utf8mb4 ;