drop database if exists matbang;
create database matbang;
use matbang;

create table matbang(
	id int(10) primary key auto_increment,
    name varchar(45),
    `status` nvarchar(20),
    area int,
    floor int,
    type_matBang nvarchar(45),
    price double,
    start_date date,
    end_date date
);