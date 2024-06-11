SELECT s.nombre, c.nombre, c.primerApellido, c.segundoApellido 
FROM SUCURSAL AS s INNER JOIN COLABORADOR as c
ON s.idSucursal = c.FK_idSucursal 
WHERE s.idSucursal = 1 AND c.rol = 1;