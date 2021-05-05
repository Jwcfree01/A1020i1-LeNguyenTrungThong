drop database if exists B6;
create database B6;
use B6;

create table product(
id int primary key,
productCode int,
productName varchar(50),
productPrice double,
productAmount double,
productDescription text,
productStatus varchar(50),
id_test int,
foreign key (id_test) references test(id)
);

insert into product values
(1, 1, 'name1', 20000, 10000, 'name1Of', 'on'),
(2, 2, 'name2', 40000, 20000, 'name2Of', 'on'),
(3, 3, 'name3', 60000, 30000, 'name3Of', 'off'),
(4, 4, 'name2', 20000, 30000, 'name4Of', 'off');

-- index 

create index index_product
on product (productCode);

create index index_product2 
on product (productName, productPrice);

select * from product
where productCode = 2;

select * from product
where productName = 'name2' and productPrice = 20000;

-- view 
create view view_product
as 
select productCode, productName, productPrice, productStatus
from product;

-- hiển thị full
select  productCode, productName 
from view_product;

-- xóa view
drop view if exists view_product;
-- view còn có thể che dấu thông tin người dùng

-- SP

delimiter //
create procedure find_name_product (in p_keywork varchar(10))
begin 
	select *
    from product
    where name like concat('%', p_keywork, '%');
end;
delimiter//

call find_name_product ('n');





