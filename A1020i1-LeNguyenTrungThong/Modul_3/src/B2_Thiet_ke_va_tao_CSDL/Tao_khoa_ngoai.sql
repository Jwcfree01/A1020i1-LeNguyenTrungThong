drop database if exists Tao_khoa_ngoai;
create database Tao_khoa_ngoai;
use Tao_khoa_ngoai;

CREATE TABLE customers(
   id INT AUTO_INCREMENT PRIMARY KEY,
   name VARCHAR(40),
   address VARCHAR(255),
   email VARCHAR(255)
);

create table orders(
	id int primary key auto_increment,
    staff varchar(50),
    customer_id1 int,
    FOREIGN key (customer_id1) references customers(id)
);

