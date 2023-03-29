const jokeElement = document.getElementById("joke");
const authorElement = document.getElementById("author");
const nextBtn = document.getElementById("next-joke");

function loadJoke(){
  fetch("https://v2.jokeapi.dev/joke/Programming?type=single")
  .then((data) => data.json())
  .then((obj) => {
    console.log(obj)
    let {joke, category} = obj;
    console.log(joke);
    console.log(category);
    jokeElement.innerText = joke;
    authorElement.innerText = category;
  });
}
loadJoke();  // загружает при первоначальном открытии страницы

nextBtn.addEventListener('click', ()=>{
  loadJoke();
});



