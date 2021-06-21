drop database if exists users;
create database users;
use users;

create table user(
	id int primary key auto_increment,
    `name` nvarchar(25),
    email nvarchar(50),
    country nvarchar(150)
);

insert into user values 
(1, 'thong', 'letrungthong@gmail.com', 'Quang Nam'),
(2, 'thuan', 'thuan@gmail.com', 'Da Nang'),
(3, 'Dat', 'dat@gmail.com', 'Hue');

select * from user order by `name`;

--  
DELIMITER $$

create procedure findAll()
begin
	select * from user;
end$$

DELIMITER ;

DELIMITER $$

create procedure update_user(in user_id int, in user_name varchar(50), in user_email varchar(50), in user_country varchar(50) )
begin
	update user
    set `name` = user_name, email = user_email, country = user_country
    where id = user_id;
end$$

DELIMITER ;

DELIMITER $$

create procedure delete_user (in user_id int)

begin
	delete from users where id = user_id;
end$$

DELIMITER ;
 
call update_user(3, "Dat123", "dat@gmail.com", "Hue");



