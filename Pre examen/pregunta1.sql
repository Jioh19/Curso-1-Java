-- Pregunta 1 del examen
SELECT s.nombre FROM SUCURSAL AS s;

SELECT c.nombre, c.primerApellido, c.segundoApellido 
FROM COLABORADOR as c;

SELECT s.nombre, c.nombre, c.primerApellido, c.segundoApellido 
FROM SUCURSAL AS s, COLABORADOR as c
WHERE s.idSucursal = c.FK_idSucursal AND s.idSucursal = 1;

SELECT s.nombre, c.nombre, c.primerApellido, c.segundoApellido 
FROM SUCURSAL AS s INNER JOIN COLABORADOR as c
ON s.idSucursal = c.FK_idSucursal 
WHERE s.idSucursal = 1;