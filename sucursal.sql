CREATE DATABASE sucursal;
USE sucursal;
CREATE TABLE sucursal (
  pk_SucursalID INT PRIMARY KEY AUTO_INCREMENT,
  nomSucursal VARCHAR(255) NOT NULL,
  paisSucursal VARCHAR(255) NOT NULL,
  tipusSucursal VARCHAR(255) NOT NULL
);
