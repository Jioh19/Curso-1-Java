const cards = document.querySelectorAll('.card');
cards.forEach((card) => {
	card.addEventListener('mouseover', (event) => {
		card.classList.add('flip-2-hor-top-1');
	});
});
