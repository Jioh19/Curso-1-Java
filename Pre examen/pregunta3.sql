SELECT c.nombre, c.primerApellido, c.segundoApellido, s.nombre
FROM CLIENTE AS c
INNER JOIN VENTA AS v
ON v.FK_rutCliente = c.rutCliente
INNER JOIN SUCURSAL as s
ON v.FK_idSucursal = s.idSucursal
WHERE s.idSucursal = 1;

