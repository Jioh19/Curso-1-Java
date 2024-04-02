function calcular() {
	const descuento1 = 0.85;
	const descuento2 = 0.92;
	let valorTraje = Number(document.querySelector('#costo').value);
	const resultado = document.querySelector('#resultado');
	if (valorTraje > 25000) {
		valorTraje = valorTraje * descuento1;
	} else {
		valorTraje *= descuento2;
	}
	resultado.innerHTML = valorTraje;
}
