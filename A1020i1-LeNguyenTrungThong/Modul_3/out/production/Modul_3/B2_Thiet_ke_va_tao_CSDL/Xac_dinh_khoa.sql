drop database if exists Xac_dinh_khoa;
create database Xac_dinh_khoa;
use Xac_dinh_khoa;

create table accounts(
	account_number int primary key auto_increment,
    account_type varchar(50),
    `day` date,
    balance double
); 

create table customer(
	customer_number int primary key auto_increment,
    full_name varchar(50),
    address varchar(100),
    email varchar(50),
    phone int(11),
    account_number_account int,
    foreign key (account_number_account) references accounts(account_number)
);

create table transactions(
	tran_number int auto_increment primary key,
    account_number int(20),
    `date` date,
    amount double,
    `description` varchar(1000),
    account_number_account int,
    foreign key (account_number_account) references accounts (account_number)
);