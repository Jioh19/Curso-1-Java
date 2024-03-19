function calcular() {
	let num0 = 0;
	let num1 = 1;
	let num = Number(document.querySelector('#fibonacci').value);
	const resultado = document.querySelector('#resultado');
	let i = 2;
	while (i < num) {
		let aux = num0 + num1;
		num0 = num1;
		num1 = aux;
		i += 1;
	}
	resultado.innerHTML = num1;
}

//sumatoria(n) = n*(n+1)/2

function sumatoria() {
	let num = Number(document.querySelector('#fibonacci').value);
	const resultado = document.querySelector('#resultado2');
	let total = 0;
	for (let i = 1; i <= num; i++) {
		total += i;
	}
	resultado.innerHTML = total;
}
