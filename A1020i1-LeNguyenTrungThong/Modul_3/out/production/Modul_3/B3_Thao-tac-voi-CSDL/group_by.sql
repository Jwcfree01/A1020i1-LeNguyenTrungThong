drop database if exists abcde;
create database abcde;
use abcde;

create table orders_detail(
	order_detail int primary key,
    price double
);

create table orders(
	order_num int primary key,
    order_day date,
    order_status varchar(50),
    comments varchar(50),
    id_fe int,
    foreign key(id_fe) references orders_detail (order_detail)
);

insert into orders_detail
value
(1, 10),
(2, 20.5),
(3, 20),
(4, 12.4);

insert into orders
value
(1, '2000/10/24', 'ngon1', 'abc',2),
(2, '2000/10/24', 'ngon2', 'abc',1),
(3, '2000/10/24', 'ngon3', 'abc',3),
(4, '2000/10/24', 'ngon1', 'abc',2);

select order_status, count(*) as 'So luong status'
from orders
group by order_status ;

select order_num, order_status, price, order_detail, sum(price) as prices from orders inner join orders_detail on orders.id_fe = orders_detail.order_detail
group by order_status
