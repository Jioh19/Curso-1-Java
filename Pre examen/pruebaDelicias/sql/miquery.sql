SELECT s.nombre AS sucursal, p.idProducto AS id, p.nombreProducto AS producto, c.nombre AS categoria, st.stock
FROM SUCURSAL AS s
INNER JOIN stock AS st
on s.idSucursal = st.idSucursal
INNER JOIN PRODUCTO AS p
ON p.idProducto = st.idProducto
INNER JOIN CATEGORIA_PRODUCTO AS c
ON c.idCategoriaProducto = p.FK_idCategoriaProducto
WHERE s.nombre = "Bandera" AND c.nombre = 'Alimento dulce';