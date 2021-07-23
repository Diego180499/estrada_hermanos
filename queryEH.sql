
create database zapateria;
use zapateria;

create table zapateria.cliente(
`id_cliente` varchar(20) primary key,
`nombre` varchar(10) not null,
`apellido` varchar(10) not null,
`telefono` int(15) not null,
`email` varchar(50) not null
);

create table zapateria.proveedor(
`id_proveedor` varchar(20) primary key,
`nombre` varchar(20) not null,
`apellido` varchar(20) not null,
`direccion` varchar(50) not null,
`telefono` int(15) not null,
`email` varchar(75) not null
);


create table zapateria.producto(
`id_producto` varchar(20) primary key,
`nombre` varchar(20) not null,
`precio_compra` double(10,2) not null,
`precio_venta` double(10,2) not null,
`id_tipo_producto` varchar(20) not null
);

create table zapateria.tipo_producto(
`id_tipo_producto` varchar(20) primary key,
`nombre` varchar(20) not null
);

create table zapateria.detalle_compra(
`id_detalle_compra` varchar(20) primary key,
`id_compra` varchar(20) not null,
`id_producto` varchar(20) not null,
`cantidad_producto` int(10) not null,
`total_compra` double(10,2) not null
);

create table zapateria.compra(
`id_compra` varchar(20) primary key,
`id_proveedor` varchar(20) not null,
`fecha_compra` date not null
);

create table zapateria.venta(
`id_venta` varchar(20) primary key,
`id_cliente` varchar(20) not null,
`fecha_venta` date not null
);

create table zapateria.detalle_venta(
`id_detalle_venta` varchar(20) primary key,
`id_venta` varchar(20) not null,
`id_producto` varchar(20) not null,
`cantidad_producto` int(10) not null,
`total_venta` double(10,2) not null
);


alter table zapateria.detalle_compra
add constraint `fk_compra` foreign key (id_compra) 
references zapateria.compra(id_compra);

alter table zapateria.detalle_compra
add constraint `fk_producto_compra` foreign key (id_producto)
references zapateria.producto(id_producto);

alter table zapateria.compra
add constraint `fk_proveedor` foreign key (id_proveedor)
references zapateria.proveedor(id_proveedor);

alter table zapateria.detalle_venta
add constraint `fk_producto_vendido` foreign key (id_producto)
references zapateria.producto(id_producto);

alter table zapateria.detalle_venta
add constraint `fk_venta` foreign key (id_venta)
references zapateria.venta(id_venta);
 
alter table zapateria.venta
add constraint `fk_cliente` foreign key (id_cliente)
references zapateria.cliente(id_cliente);

alter table zapateria.producto
add constraint `fk_tipo_producto` foreign key (id_tipo_producto)
references zapateria.tipo_producto(id_tipo_producto);


show columns from zapateria.cliente;
insert into zapateria.tipo_producto(id_tipo_producto, nombre) values ("1","zapato");
insert into zapateria.tipo_producto(id_tipo_producto, nombre)
 values 
 ("2","cincho"),
("3","billetera"),
("4","zapato_mujer");

CREATE TABLE `zapateria`.`pago_proveedor` (
  `id_pago_proveedor` INT primary key AUTO_INCREMENT,
  `id_compra` VARCHAR(45) NOT NULL,
  `monto_pago` DOUBLE NOT NULL,
  `fecha_pago` DATE NOT NULL);

alter table zapateria.pago_proveedor
add constraint `fk_pago_proveedor` foreign key (id_compra)
references zapateria.compra(id_compra);

ALTER TABLE `zapateria`.`pago_proveedor` 
RENAME TO  `zapateria`.`pago_compra` ;

ALTER TABLE `zapateria`.`compra` 
ADD COLUMN `total_compra` DOUBLE NULL AFTER `fecha_compra`;

ALTER TABLE `zapateria`.`venta` 
ADD COLUMN `total_venta` DOUBLE NOT NULL AFTER `fecha_venta`;




select * from detalle_compra;
show columns from zapateria.detalle_compra;

show columns from detalle_compra;

select * from detalle_venta;
delete from venta;


select * from pago_compra where id_compra = 1;


select * from mysql.user;

select * from mysql.user;



