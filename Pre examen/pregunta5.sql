SELECT COUNT(v.idVenta) as cuenta, c.nombre, c.primerApellido, c.segundoApellido, s.nombre
FROM VENTA AS v
INNER JOIN CLIENTE AS c
ON v.FK_rutCliente = c.rutCliente
INNER JOIN SUCURSAL as s
ON v.FK_idSucursal = s.idSucursal
GROUP BY c.nombre, s.nombre
ORDER BY cuenta DESC
LIMIT 10;
