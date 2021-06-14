drop database if exists setup;
create database setup;
use setup;

create table customer_type(
	customer_type_id int(10) primary key,
    customer_type_name varchar(45)
);

create table customer(
	customer_id int primary key auto_increment,
    customer_type_id int(10),
    customer_name varchar(45),
    customer_birthday date,
    customer_gender nvarchar(10),
    customer_id_card nvarchar(11),
    customer_phone varchar(11),
    customer_email varchar(45),
    customer_address varchar(45),
    foreign key (customer_type_id) references customer_type (customer_type_id)
);

insert into customer_type values
('1','Diamond'),
('2', 'Platinum'),
('3', 'Gold'),
('4', 'Silver'),
('5', 'Member');

insert into customer values
(1, 1, 'thong', '2000/04/14', 'male', '206267400', 0981729499, 'letrungthong@gmail.com', 'quang nam'),
(2, 1, 'hoa', '2000/04/14', 'male', '206267400', 0981729499, 'letrungthong@gmail.com', 'quang nam'),
(3, 1, 'hoàng', '2000/04/14', 'male', '206267400', 0981729499, 'letrungthong@gmail.com', 'quang nam'),
(4, 1, 'thanh', '2000/04/14', 'male', '206267400', 0981729499, 'letrungthong@gmail.com', 'quang nam'),
(5, 1, 'vu', '2000/04/14', 'male', '206267400', 0981729499, 'letrungthong@gmail.com', 'quang nam'),
(6, 1, 'khoa', '2000/04/14', 'male', '206267400', 0981729499, 'letrungthong@gmail.com', 'quang nam');

select customer_id, customer_type_name, customer_name, customer_birthday, customer_gender, customer_id_card, 
customer_phone, customer_email, customer_address
from customer left join customer_type on customer_type.customer_type_id = customer.customer_type_id;

select customer_id, customer_type_name, customer_name, customer_birthday, customer_gender, customer_id_card, customer_phone, customer_email, 
customer_address
from customer left join customer_type on customer_type.customer_type_id = customer.customer_type_id
where customer_id = 3;

select customer_id, customer_type_name , customer_name, customer_birthday, customer_gender, customer_id_card,
            customer_phone, customer_email, customer_address
            from customer left join customer_type on customer_type.customer_type_id = customer.customer_type_id
            where customer_name like '%t%';
            
update customer
set customer_type_name = 'Gold', customer_name = 'hoang123'
-- customer_birthday = ?, customer_gender = ?, customer_id_card = ?, customer_phone = ?, customer_email = ?, customer_address = ?
            where customer_id = 2;
            
            
            
            
            