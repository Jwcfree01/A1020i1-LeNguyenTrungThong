drop database if exists CSDL;
create database CSDL;
use CSDL;

create table product_line(
	id_product_line int auto_increment primary key,
    desciption text
);

create table products(
	id_product int auto_increment primary key,
    name_product varchar(100) not null,
    nha_cung_cap varchar(100) not null,
    so_luong int not null,
    gia_nhap double not null,
    gia_ban double not null,
    product_line_id_product_line int not null,
    foreign key (product_line_id_product_line) references product_line (id_product_line)
);

create table office(
	id_van_phong int auto_increment primary key,
    address_van_phong varchar(200) not null,
    phone_van_phong int(11) not null,
    quoc_gia varchar(50) not null
);

create table employees(
	id_employee int auto_increment primary key,
    name_employee varchar(50) not null,
    email varchar(50) not null,
    cong_viec varchar(100) not null,
    office_id_van_phong int,
    foreign key (office_id_van_phong) references office (id_van_phong)
);

create table customer(
	id_cus int auto_increment primary key,
    name_cus varchar(50),
    phone_cus int(11),
    address_cus varchar(1000),
    Employees_id_employee int,
    foreign key (Employees_id_employee) references employees (id_employee)
);

create table orders(
	id_order int auto_increment primary key,
    ngay_mua date not null,
    ngay_giao_yeu_cau date not null,
    ngay_giao_thuc_te date,
    so_luong int not null,
    don_gia double not null,
    customer_id_cus int,
    foreign key (customer_id_cus) references customer (id_cus)
);

create table OrderDetails (
	id_pro1 int,
    id_order1 int,
    primary key(id_pro1, id_order1),
    foreign key (id_pro1) references products (id_product),
    foreign key (id_order1) references orders (id_order)
);

create table payments(
	id_payment int primary key auto_increment,
    ngay_thanh_toan date not null,
    so_tien double not null,
    customer_id_cus int not null,
    foreign key (customer_id_cus) references customer (id_cus)
);