SELECT o.country, o.city, count(*)
FROM offices as o
INNER JOIN employees as e
on o.officeCode = e.officeCode
INNER JOIN customers as c
on e.employeeNumber = c.salesRepEmployeeNumber
INNER JOIN orders as ord
on ord.customerNumber = c.customerNumber
group by o.country, o.city
ORDER By count(*) DESC; 
