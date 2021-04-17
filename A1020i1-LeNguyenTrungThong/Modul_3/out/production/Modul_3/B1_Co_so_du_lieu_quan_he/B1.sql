drop database if exists B1;

create database B1;

use B1;

create table student(
id int primary key auto_increment,
`name` varchar(30), 
age int
);

insert into student (`name`, age)
value 
('dat',22),
('thong', 20),
('thuan', 23);

select `name`
from student
where age = 20;

update student
set `name` = thong1
where `name` = thong;