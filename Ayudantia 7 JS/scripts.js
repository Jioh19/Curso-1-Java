function toFahrenheit() {
	const celsius = Number(document.querySelector('#entrada').value);
	const resultado = document.querySelector('#resultado');
	const fahrenheit = (celsius * 9) / 5 + 32;
	resultado.innerHTML = fahrenheit;
}

function toCelsius() {
	const fahrenheit = Number(document.querySelector('#entrada').value);
	const resultado = document.querySelector('#resultado');
	const celsius = ((fahrenheit - 32) * 5) / 9;
	resultado.innerHTML = celsius;
}
// Formula para pasar a Celsius
// (F°-32) * 5 / 9

function numPrimo() {
	const valor = document.querySelector('#primo').value;
	const resultado = document.querySelector('#resultado2');
	let esPrimo = 'Es Primo';
	for (let i = 2; i <= Math.sqrt(valor); i++) {
		if (valor % i == 0) {
			esPrimo = 'No es Primo';
			break;
		}
	}
	resultado.innerHTML = esPrimo;
}
