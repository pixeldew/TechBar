--step 1
create database itSolutiondb;

--step 2
use itSolutiondb;

--step 3
create table usersProblem(id INT PRIMARY KEY AUTO_INCREMENT,userName VARCHAR(100), phone VARCHAR(100), problemDescription VARCHAR(150),status VARCHAR(100));

--step 4
select * from usersProblem;

--step 5
insert into usersProblem(userName,phone,problemDescription,status)values ("mahak noori", "5648731598", "wifi not working", "waiting"), ("tanishka sayyad","9039999075","cpu issue","serving");

