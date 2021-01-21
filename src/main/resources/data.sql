DROP TABLE IF EXITS cliente;

create table cliente(
	id int auto_increment,
	nombre varchar(250),
	apellido varchar(250),
	direccion varchar(100),
	dni integer ,
	fecha date
	
);

insert into cliente(nombre, apellido, direccion, dni, fecha)
values 
('Carlos', 'Mango', 'calle murcial', 555666, '2000-01-01'),
('Ronaldo', 'Cristianao', 'calle madrid', 1556, '20001-02-02'),
('Mario', 'Casas', 'calle murcial', 555666, '2002-03-01'),
('Michel', 'Arango', 'calle murcial', 555666, '2003-04-01');
