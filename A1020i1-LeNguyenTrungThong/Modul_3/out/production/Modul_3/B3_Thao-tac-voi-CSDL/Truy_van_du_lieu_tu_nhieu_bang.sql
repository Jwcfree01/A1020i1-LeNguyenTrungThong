drop database if exists bcd;
create database bcd;
use bcd;

create table customer(
	cusNumber int primary key,
    cusname varchar(50),
    contactLastName varchar(50),
    contactFirstName varchar(50),
    phone int(11),
    address1 varchar(200),
    address2 varchar(200),
    city varchar(50),
    state varchar(50),
    postalcode int,
    country varchar(200)
);

insert into customer
values
(1, 'thong', 'le', 'thong', '0987654321', 'quangnam', 'quangnam1', 'quangnam', '10', 20, 'vietnam'),
(2, 'thong', 'le', 'thong', '0987654321', 'danang', 'danang1', 'danang2', '10', 20, 'vietnam');

create table orders(
	orderNumber int primary key,
    orderDate date,
    requiredDate date,
    shipperDay date,
    `status` varchar(50),
    `comment` text,
    cusNumber1 int,
    foreign key (cusNumber1) references customer (cusNumber)
);

insert into orders
values
(5, '2000/10/10', '2000/10/13', '2000/10/15', 'ok', 'ngon', 2);

create table payment(
	cusNumber2 int primary key,
    checkNumber int,
    paymentDate date,
    cus1 int,
    foreign key(cus1) references customer(cusNumber)
);

insert into payment
values
(30, 10, '2000/10/15', 1);

select cusNumber, cusName, phone, paymentDate from payment inner join customer on payment.cus1 = customer.cusNumber
where city = 'quangnam'