/**********************************
  @Author   : Er.Prasad B. Badwar.
  @Date     : 21/04/2023
  @Database : PostgreSQL 14.7
***********************************/
create database employeedb;
\c employeedb;
create table employee(employee_id int8 not null,employee_name varchar(50), date_of_birth date,primary key(employee_id));
insert into employee values(101,'Prasad Badwar','2000-07-29'),(102,'Chetana Bachhav','2000-05-30');
