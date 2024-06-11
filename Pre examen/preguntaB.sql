SELECT customerNumber, customerName, creditLimit 
FROM customers as c
WHERE customerName LIKE "%Ltd%"
ORDER BY creditLimit DESC;