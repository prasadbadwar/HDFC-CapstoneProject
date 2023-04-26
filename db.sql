/**********************************
  @Author   : Er.Prasad B. Badwar.
  @Date     : 21/04/2023
  @Database : PostgreSQL 14.7
***********************************/
create database employeedb;
\c employeedb;
create table employee(employee_id int8 not null,employee_name varchar(50), date_of_birth date,primary key(employee_id));
insert into employee values(1021,'Prasad Badwar','2000-07-29'),(1022,'Chetana Bachhav','2000-05-30');
insert into employee values(1023,'Darshan Gajare','2001-05-01'),(1024,'Bhavesh Bachhav','2000-08-26'),(1025,'Ankit Muthekar','2000-04-28');