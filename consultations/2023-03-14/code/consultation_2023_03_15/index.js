// cupOfTee       - lowerCamelCase
// cup_of_coffee  - snake_case
// CUP_OF_JUICE   - screaming_snake_case
// border-radius  - kebab-case

const container = document.getElementById("btn-container");
const coffeeButton = container.firstElementChild;
const imageOfCoffee = document.getElementById("img1");
const emptyCup = document.getElementById("img2");
const drinkButton = coffeeButton.nextElementSibling;
const washButton = container.children[2];

console.log(drinkButton);

container.addEventListener('click', () => {
  console.log("Container click");
});

coffeeButton.addEventListener('click', () => {
  console.log("Cup of coffee");
  imageOfCoffee.style.display = "block";
});

drinkButton.addEventListener('click', () => {
  console.log("Drink this cup");
  imageOfCoffee.style.display = "none";
  emptyCup.style.display = "block";
});

washButton.addEventListener('click', () => {
  console.log("Wash all this cup");
  // imageOfCoffee.style.display = "none";
  emptyCup.style.display = "none";
});













