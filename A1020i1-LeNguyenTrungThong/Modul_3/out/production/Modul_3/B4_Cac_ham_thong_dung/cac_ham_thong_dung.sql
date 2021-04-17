drop database if exists abc;
create database abc;
use abc;

create table detail_student(
	id int primary key ,
    ten varchar(30),
    tuoi int,
    khoaHoc varchar(20),
    soTien double
);

insert into detail_student values
(1, 'hoang', 21, 'cntt', 400000),
(2, 'viet', 19, 'dtvt', 320000),
(3, 'thanh', 18, 'ktdn', 400000),
(4, 'nhan', 19, 'ck', 450000),
(5, 'huong', 20, 'tcnh', 200000),
(6, 'huong', 20, 'tcnh', 500000);

select ten from detail_student
where ten = 'huong';

select ten, soTien, sum(soTien) from detail_student
where ten = 'huong';

select ten from detail_student
group by ten