drop database if exists users;
create database users;
use users;

create table user(
	id int primary key auto_increment,
    `name` nvarchar(25),
    email nvarchar(50),
    country nvarchar(150)
);

insert into user values 
(1, 'thong', 'letrungthong@gmail.com', 'Quang Nam'),
(2, 'thuan', 'thuan@gmail.com', 'Da Nang'),
(3, 'Dat', 'dat@gmail.com', 'Hue');