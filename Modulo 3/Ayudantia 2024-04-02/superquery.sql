
select o.orderNumber, o.orderDate, c.customerName, od.productCode, p.productName, od.quantityOrdered, od.priceEach,
(od.quantityOrdered * od.priceEach) as Subtotal, (od.quantityOrdered * od.priceEach)*1.19 as conIVA
from orders as o
inner join customers as c
on o.customerNumber = c.customerNumber
inner join orderdetails od
on o.orderNumber = od.orderNumber
inner join products p
on p.productCode = od.productCode
where o.orderNumber = 10101;

select * from products;