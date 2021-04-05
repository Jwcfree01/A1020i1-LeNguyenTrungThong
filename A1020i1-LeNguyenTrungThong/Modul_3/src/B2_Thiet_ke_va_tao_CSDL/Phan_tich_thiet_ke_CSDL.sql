drop database if exists CSDL;
create database CSDL;
use CSDL;

create table customer(
	id_cus int auto_increment primary key,
    name_cus varchar(50),
    phone_cus int(11),
    address_cus varchar(1000)
);

create table product_line(
	id_product_line int auto_increment primary key,
    desciption text
);

create table products(
	id_product int auto_increment primary key,
    name_product varchar(100),
    nha_cung_cap varchar(100),
    so_luong int,
    gia_nhap double,
    gia_ban double
);

create table orders(
	id_order int auto_increment primary key,
    ngay_mua date,
    ngay_giao_yeu_cau date,
    ngay_giao_thuc_te date,
    so_luong int,
    don_gia double
);

create table payments(
	id_payment int primary key auto_increment,
    ngay_thanh_toan date,
    so_tien double
);

create table employees(
	id_employee int auto_increment primary key,
    name_employee varchar(50),
    email varchar(50),
    cong_viec varchar(100)
);

create table office(
	id_van_phong int auto_increment primary key,
    address_van_phong varchar(200),
    phone_van_phong int(11),
    quoc_gia varchar(50)
);
