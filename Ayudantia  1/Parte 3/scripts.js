function login() {
	const user = document.querySelector('#user').value;
	const password = document.querySelector('#password').value;
	console.log('Mi user es :', user);
	console.log('Mi password es: ', password);

	const pagina = document.querySelector('#pagina');
	pagina.innerHTML = `Esta es la informacion ingresada por el usuario ${user}, ${password} `;
}
