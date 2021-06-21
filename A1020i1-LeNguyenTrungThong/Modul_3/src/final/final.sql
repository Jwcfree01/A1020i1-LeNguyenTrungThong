drop database if exists matbang;
create database matbang;
use matbang;

create table test(
	id int primary key,
    age int,
    diem int
    );
    
insert into test values
(1, 20, 4),
(2, 7, 30),
(3, 5, 10);

select *, avg(diem) as tong
from test
group by age;
-- having tong>5;

EXPLAIN select * 
from test;


create table matbang(
	id int(10) primary key auto_increment,
    name_matbang varchar(45),
    status_matbang nvarchar(20),
    area int,
    floor int,
    type_matBang nvarchar(45),
    price double,
    start_date date,
    end_date date
);



-- insert into matbang (name_matbang, status_matbang, area, floor, type_matBang, price, start_date, end_date)
-- values (?,?,?,?,?,?,?,?);

insert into matbang values
(1, 'thong', 'Trống', 1000, 12, 'van phong', 1200, '2000/04/14', '2000/04/20'),
(2, 'thong', 'Trống', 2000, 12, 'van phong', 1200, '2000/04/14', '2000/04/20'),
(3, 'thong', 'Trống', 4000, 12, 'van phong', 1200, '2000/04/14', '2000/04/20'),
(4, 'thong', 'Trống', 3000, 12, 'van phong', 1200, '2000/04/14', '2000/04/20');

select* from matbang
order by area;

