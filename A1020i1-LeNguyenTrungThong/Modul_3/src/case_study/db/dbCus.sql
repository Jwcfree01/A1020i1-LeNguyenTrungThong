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
    employee_id_card int(11),
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
-- update employee
-- set employee_name = ?, employee_birthday = ?, employee_id_card = ?, employee_salary = ?, employee_phone = ?, employee_email = ?, 
-- employee_address = ?, position_id = ?, education_degree_id = ?, division_id = ?, user_name = ?
--  where employee_id = ?

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
    poll_servicearea int,
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

insert into service_type values
(1, 'villa'),
(2, 'house'),
(3, 'room');

insert into rent_type values
(1, 'yeah', 5000),
(2, 'month', 3000),
(3, 'day', 2000),
(4, 'house', 1000);

insert into customer values
(1, 1, 'thong', '2000/04/14', 'male', '206267400', 0981729499, 'letrungthong@gmail.com', 'quang nam');

-- delete from customer 
-- where customer_id = 3;

select * from customer
where customer_id = 1;

insert into position values
(1, 'Director'),
(2, 'Manager'),
(3, 'Supervisor'),
(4, 'Specialist'),
(5, 'Waiter'),
(6, 'Receptionist');

insert into education_degree values
(1, 'Graduate'),
(2, 'University'),
(3, 'College'),
(4, 'Intermediate');

insert into division values
(1,'Sale–Marketing'),
(2, 'Management'),
(3, 'Waiter'),
(4, 'Administrative');

insert into employee 
values (1, 'abc', '2021-12-10', 646464646, 55656, '0981729499', 'letrungthong14042000@gmail.com', '71 dũng sĩ thanh khê đà nẵng', 1, 1, 1, 
'hoangthaovitt@gmail.com');

select employee_id, employee_name, employee_birthday, employee_id_card, employee_salary, employee_phone, employee_email, employee_address, 
position_name, education_degree_name, division_name
from employee inner join position on employee.position_id = position.position_id
inner join education_degree on employee.education_degree_id = education_degree.education_degree_id
inner join division on employee.division_id = division.division_id;

update customer set customer_type_id = 4, customer_name = 'abc', customer_birthday = '2021-07-01', customer_gender = 'female', 
customer_id_card = 206267400, customer_phone = 0981729499, customer_email = 'abc@gmail.com', customer_address = 'quang nam'
where customer_id = 2;

select *from service
