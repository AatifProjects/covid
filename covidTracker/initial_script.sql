create database test;

\c test;

create table employee{
	id serial not null primary key,
	name varchar(10),
	email varchar(15)
};
