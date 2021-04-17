drop database if exists abc;
create database abc;
use abc;

create table product_line(
	id_productLine int primary key,
    textDescription text,
    htmlDescription text,
    image text
);

insert into product_line
values
(1, 'abcd', 'html', 'image1'),
(2, 'bcd', 'html2', 'image2');

create table products(
	id_product int primary key,
    name_product varchar(100) not null,
    nha_cung_cap varchar(100) not null,
    so_luong int not null,
    gia_nhap double not null,
    gia_ban double not null,
    id_product_line int not null,
    foreign key (id_product_line) references product_line (id_productLine)
);

insert into products
values 
(1, 'xehoi', 'toyota', 10, 1000, 2000, 1),
(2, 'xehoi2', 'honda', 20, 5000, 10000, 2);

select id_product, name_product, gia_nhap, so_luong, htmlDescription from products inner join product_line on products.id_product_line = product_line.id_productLine
where gia_nhap >500 and so_luong >5;

select name_product, nha_cung_cap from products
where nha_cung_cap = 'toyota' or nha_cung_cap = 'honda'