drop database if exists dgt;
create database dgt;
use dgt;
create table infractores (
      dni VARCHAR(9) PRIMARY KEY,
      nombre VARCHAR(15),
      apellidos VARCHAR(30),
      antiguedad smallint,
      sancion float,
      puntos smallint);
      
insert into infractores (dni, nombre, apellidos, antiguedad, sancion, puntos) 
values ('30000000A', 'Ana', 'López', 5, 200, 8),
       ('31111111G', 'Pedro', 'Sánchez', 14, 500, 10),
       ('32323232P', 'Juan', 'Martos', 8, 300, 14),
       ('44457454S', 'Marta', 'Peña', 20, 100, 9),
       ('36534567T', 'María', 'Marín', 1, 100, 13),
       ('36767565N', 'Luis', 'González', 3, 300, 1),
       ('48456561K', 'Sonia', 'Tena', 11, 200, 12);
       
      
create table sanciones (
      idSancion smallint primary key auto_increment,
      descripcion varchar(50),
      importe float);
      
insert into sanciones (descripcion, importe)
values ('No llevar casco', 200),
       ('Conduccion temararia',500),
       ('No llevar cinturón', 200),
       ('Tirar una colilla', 150),
       ('Tasa de alcohol superior a 0.60', 500),
       ('No hacer le stop', 250);
      
create table partes_reparacion (
    bastidor varchar(30) primary key,
    marca varchar(20),
    modelo varchar(30),
    importe float,
    año smallint);
    
insert into partes_reparacion 
VALUES ('GLK12234RT2309', 'Hyundai', 'ix35 Sportage', 600, 2010),
	   ('KIL0484984KD99', 'Seat', 'LEON 1.9 TDI', 200, 2015),
	   ('KIJ7474747HF88', 'Reanult', 'Laguna 1.7', 580, 2018),
	   ('DAS873266HG433', 'Hyundai', 'tucson famuly', 950, 2021),
	   ('IID9839838JS89', 'Opel', 'Vectra 1.8', 570, 2018),
	   ('BHJ33948DM9922', 'Mercedes', 'Calse C 2.2', 1350, 2018),
	   ('KJD838KDK99392', 'BMW', 'X6 Runner Sport', 950, 2022),
	   ('PO83993JJSOID1', 'Opel', 'Corsa Limited', 410, 2011),
	   ('JS6893938JFJ88', 'Seat', 'Altea Space', 4000, 2010),
	   ('SA7373820JJ092', 'Opel', 'Insignia 2.0tdi', 715, 2010);

      