CREATE DATABASE Reto5;
Use Reto5;

CREATE TABLE Productos 
( 
Codigo integer auto_increment,
Nombre text,
Precio double,
Inventario integer,
Primary Key(Codigo)
);

SHOW TABLES;

INSERT INTO Productos (Nombre,Precio,Inventario) values ('Manzanas',5000.0,25);
INSERT INTO Productos (Nombre,Precio,Inventario) values ('Limones',2300.0,15);
INSERT INTO Productos (Nombre,Precio,Inventario) values ('Peras',2700.0,33);
INSERT INTO Productos (Nombre,Precio,Inventario) values ('Arandanos',9300.0,5);
INSERT INTO Productos (Nombre,Precio,Inventario) values ('Tomates',2100.0,42);
INSERT INTO Productos (Nombre,Precio,Inventario) values ('Fresas',4100.0,3);
INSERT INTO Productos (Nombre,Precio,Inventario) values ('Helado',4500.0,41);
INSERT INTO Productos (Nombre,Precio,Inventario) values ('Galletas',500.0,8);
INSERT INTO Productos (Nombre,Precio,Inventario) values ('Chocolates',3500.0,80);
INSERT INTO Productos (Nombre,Precio,Inventario) values ('Jamon',15000.0,10);

SELECT * FROM Productos;

