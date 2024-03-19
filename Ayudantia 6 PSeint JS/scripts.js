function leer() {
	const nota1 = document.querySelector('#nota1').value;
	const nota2 = document.querySelector('#nota2').value;
	const nota3 = document.querySelector('#nota3').value;
	const nota4 = document.querySelector('#nota4').value;
	console.log(nota1, nota2, nota3, nota4);
	const promedio = (+nota1 + Number(nota2) + Number(nota3) + Number(nota4)) / 4;
	const resultado = document.querySelector('#resultado');
	resultado.innerHTML = `El promedio es ${promedio}`;
}
