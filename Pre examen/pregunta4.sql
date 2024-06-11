SELECT s.nombre, p.nombreProducto, st.stock
FROM delicias.SUCURSAL AS s
INNER JOIN stock AS st
on s.idSucursal = st.idSucursal
INNER JOIN PRODUCTO AS p
on p.idProducto = st.idProducto;