create database jparepo;
use jparepo;

create table employee(id int primary key auto_increment,
name varchar(20) not null,email varchar(20),
age int not null);

create table address(id int primary key auto_increment,
city varchar(20) not null
,state varchar(20) not null,
employee_id int,
constraint empfk foreign key(employee_id) references employee(id) );

insert into employee values(1,"bharath","bharath@gmail.com",19),
(2,"sabari","sabari@gmail.com",20)
;

insert into address values (1,"tirupur","tamil nadu",1),
(2,"coimbatore","kerla",2);
select * from employee;
select * from address;