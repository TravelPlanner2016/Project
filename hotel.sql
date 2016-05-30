CREATE DATABASE TP_bd;
CREATE TABLE hotel
(
	idhotel SMALLINT PRIMARY KEY NOT NULL,
	name_hotel VARCHAR(30),
	stars TINYINT,
	rooms SMALLINT,
	adress VARCHAR(50) ,
    rooms SMALLINT(255) ,
	phone_number CHAR(20) ,
	email VARCHAR(50) ,
	location VARCHAR(20) ,
	min_price SMALLINT 
);
