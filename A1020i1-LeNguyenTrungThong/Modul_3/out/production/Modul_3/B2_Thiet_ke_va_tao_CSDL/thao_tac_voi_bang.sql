drop database if exists Thao_Tac_Voi_Bang;

create database Thao_Tac_Voi_Bang;

use Thao_Tac_Voi_Bang;

create table contact(
	id int primary key auto_increment,
    last_name varchar(30),
    first_name varchar(30),
    birth_day date
);

create table suppliers(
	supplier_id int primary key auto_increment,
    supplier_name varchar(30),
    account_rep varchar(50)
);

drop table suppliers;

