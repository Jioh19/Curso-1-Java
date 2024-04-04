SELECT * FROM classicmodels.customers;

/* Quiero que de la tabla de customers, seleccionen:
 - customerNumber
 - customerName
 - country
 - creditLimit
 - Agregar el filtro creditLimit mayor a 70000
 - Agregar otro filtro con la palabra clave "AND" para solo seleccionar los que tengan 
   estado = NULL
 - estado
 - Seleccionar la persona con el creditlimit mas alto
 */
 
 SELECT customerName, creditLimit from customers ORDER BY creditLimit desc limit 1;
 SELECT AVG(creditLimit) from customers;
 
 SELECT customerNumber as id, customerName as Name, country Pais, creditLimit, state 
 FROM customers 
 WHERE creditLimit >= 70000 AND state IS NULL;
 
 SELECT customerNumber, customerName, country, creditLimit
 FROM customers WHERE creditLimit >= 70000;
 
 SELECT customerNumber, customerName, country FROM customers 
 WHERE country = 'USA';
 
 SELECT * FROM classicmodels.products;

/* 
Seleccionar todos los productos con todos los atributos que pertenezcan al productLine "Classic Cars"
*/

select COUNT(*) from products 
where productLine = 'Planes';

select * from products 
where quantityInStock BETWEEN 2000 AND 4000;

select * from products 
where productLine = 'Classic Cars'
AND productVendor LIKE '%cast';