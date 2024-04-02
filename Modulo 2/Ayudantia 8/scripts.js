const cards = document.querySelectorAll('.card');

cards.forEach((card) => {
	card.addEventListener('mouseover', () => {
		card.classList.add('flip-scale-up-hor');
	});
	card.addEventListener('mouseout', () => {
		card.classList.remove('flip-scale-up-hor');
	});
});
