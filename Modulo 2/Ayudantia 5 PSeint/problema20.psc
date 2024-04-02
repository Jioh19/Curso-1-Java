Algoritmo descuento
	descuento1 <- 0.85
	descuento2 <- 0.92
	Escribir 'Seleccione el valor del traje'
	Leer valorTraje
	valorOriginal=valorTraje
	Si valorTraje>25000 Entonces
		valorTraje=valorTraje*descuento1
	SiNo
		valorTraje=valorTraje*descuento2
	FinSi
	Escribir 'El total del traje con descuento es de ', valorTraje
	Escribir 'El descuento total del traje fue de ', valorOriginal-valorTraje
FinAlgoritmo