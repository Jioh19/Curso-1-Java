SELECT factura, productos.nombre, cantidad, precio, productos.precio*cantidad as Subtotal
FROM pos.ventas, pos.productos
WHERE ventas.idproductos = productos.idproductos; 
