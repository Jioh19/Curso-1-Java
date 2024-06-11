SELECT employeeNumber, firstName, lastName, count(*) as clientes
FROM employees AS e
INNER JOIN customers AS c
ON e.employeeNumber = c.salesRepEmployeeNumber
GROUP BY employeeNumber
ORDER BY clientes DESC;