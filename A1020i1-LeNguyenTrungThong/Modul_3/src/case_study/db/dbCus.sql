drop database if exists db_Cus;
create database db_Cus;
use db_Cus;
ALTER DATABASE db_Cus CHARACTER SET utf8 COLLATE utf8_general_ci;

create table `position`(
	position_id int primary key auto_increment,
    position_name varchar(45)
);

create table education_degree(
	education_degree_id int primary key auto_increment,
    education_degree_name varchar(45)
);

-- division : bộ phận
create table division(
	division_id int primary key auto_increment,
    division_name varchar(45)
);

create table service_type(
	service_type_id int primary key auto_increment,
    service_type_name varchar(45)
);

-- attach_service: dịch vụ đi kèm
-- cost: giá
-- unit: đơn vị
create table attach_service(
	attach_service_id int primary key auto_increment,
    attach_service_name varchar(45),
    attach_service_cost double,
    attach_service_unit int,
    attach_service_status varchar(45)
);

create table customer_type(
	customer_type_id nchar(3) primary key,
    customer_type_name varchar(45)
);

create table employee(
	employee_id int primary key auto_increment,
    employee_name varchar(50),
    employee_birthday date,
    employee_id_card varchar(45),
    employee_salary double,
    employee_phone int(11),
    employee_email varchar(45),
    employee_address varchar(45),
    position_id int,
    education_degree_id int,
    division_id int,
    user_name nvarchar(50),
    foreign key(employee_id) references position (position_id),
    foreign key(education_degree_id) references education_degree (education_degree_id),
    foreign key(division_id) references division (division_id)
);

-- customer_id_card: số chứng minh
create table customer(
	customer_id int primary key auto_increment,
    customer_type_id nchar(3),
    customer_name varchar(45),
    customer_birthday date,
    customer_gender nvarchar(7),
    customer_id_card nvarchar(11),
    customer_phone int(11),
    customer_email varchar(45),
    customer_address varchar(45),
    foreign key (customer_type_id) references customer_type (customer_type_id)
);

create table rent_type(
rent_type_id int primary key auto_increment,
rent_type_name nvarchar(45),
rent_type_cost double
);

-- rent_type_id: kiểu thuê
-- standard_room: 
-- description_other_convenience: mô tả tiện nghi khác
-- poll_area:
create table service(
	service_id int primary key auto_increment,
    service_name nvarchar(45),
    service_area int,
    service_cost double,
    service_max_people int,
    rent_type_id int,
    service_type_id int,
    standard_room nvarchar(45),
    description_other_convenience nvarchar(45),
    poll_area int,
    number_of_floor int,
    foreign key (service_type_id) references service_type (service_type_id),
    foreign key (rent_type_id) references rent_type (rent_type_id)
);

-- contract: hợp đồng
-- contract_deposit: tiền đặt cọc
create table contract(
	contract_id int primary key auto_increment,
    contract_start_date date,
    contract_end_date date,
    contract_deposit double,
    contract_total_money double,
	employee_id int,
    customer_id int,
    service_id int,
    foreign key (employee_id) references employee (employee_id),
    foreign key (customer_id) references customer (customer_id),
    foreign key (service_id) references service (service_id)
);

-- contract_detail: chi tiết hợp đồng
create table contract_detail(
	contract_detail_id int primary key auto_increment,
    contract_id int,
    attach_service_id int,
    quantity int,
    foreign key (contract_id) references contract (contract_id),
    foreign key (attach_service_id) references attach_service (attach_service_id)
);

insert into customer_type values
('1','Diamond'),
('2', 'Platinum'),
('3', 'Gold'),
('4', 'Silver'),
('5', 'Member');

insert into customer values
(1, 1, 'thong', '2000/04/14', 'male', '206267400', 0981729499, 'letrungthong@gmail.com', 'quang nam');

-- delete from customer 
-- where customer_id = 3;

select * from customer
where customer_id = 1;
