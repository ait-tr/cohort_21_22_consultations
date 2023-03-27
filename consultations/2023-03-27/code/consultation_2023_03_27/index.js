let inputSecondName = document.getElementById("secondname");
let submitBtn = document.getElementById("submit-btn");
let form = document.getElementById("form");

console.log(inputSecondName); // элемент ввода
console.log("****");
console.log(inputSecondName.value);
console.log(" Привет      ");
console.log(" Привет      ".trim()); // убирает лишние пробелы в начале и конце

form.addEventListener('submit', (event)=>{
  event.preventDefault();   // предотвратить событие по умолчанию - подавить его. Событие было в редиректе 
  // если у элемента есть id:
  console.log(inputSecondName.value); // один из способов получить фамилию
  // мы можем получить значение другим способом: 
  console.log("** event **");
  console.log(event); 
  console.log("** event.target **");
  console.log(event.target); 
  console.log("** event.target[0] **"); // можно так получить поле ввода
  console.log(event.target[0]); 
  console.log("** event.srcElement[1] **"); // а можно еще вот так получить поле ввода
  console.log(event.srcElement[1]); 
  console.log("** Second name **"); 
  console.log(event.target[0].value);
  console.log("** Profession **"); 
  console.log(event.target[1].value);
  const user = {
    secondName: event.target[0].value.trim(), 
    profession: event.target[1].value.trim().toUpperCase()
  }; 
  console.log(user);

});

// вторая часть страницы
const genderBtn = document.getElementById("check-gender");
const nameInput = document.getElementById("name");
const resultElement = document.getElementById("result");

async function f(){
  let name = nameInput.value;
  let response = await fetch(`https://api.genderize.io/?name=${name}`);
  let obj = await response.json();
  console.log(response);
  console.log(obj);
  resultElement.innerText = obj.gender + " " + obj.probability;
}
genderBtn.addEventListener('click', ()=>{
  f();
});




