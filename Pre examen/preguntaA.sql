SELECT o.country, o.city, e.firstName, e.lastName, e.email 
FROM employees as e
INNER JOIN offices as o
ON o.officeCode = e.officeCode;