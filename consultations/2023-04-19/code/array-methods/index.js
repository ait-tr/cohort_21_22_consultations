const arr = ["Apple", "Lemon", "Grape"];
// 1. Метод map не мутирует, возвращает новый массив, 
// принимает колбэк функцию, которая описывает то, как мы из элементов старого массива
// генерируем элементы новго массива

const arr2 = arr.map((element) => "Fruit " + element);
console.log(arr2); // [ 'Fruit Apple', 'Fruit Lemon', 'Fruit Grape' ]

const arr3 = arr.map((element) => element.length);

// Пример 1 распарсить и промапить
const obj = {
  school:
  {
    students: ["Nataliz", "Alex", "Nadia", "Pavel"],
    teachers: ["Alisher", "Andrey", "Kirill"]
  }
}
// вариант без деструктуризации
const studentsArr = obj.school.students;
const teachersArr = obj.school.teachers;
// то же самое, но с деструктуризацией:
const { school } = obj;
const { teachers, students } = school;
console.log(teachers);
console.log(students);

//Поясняющий пример 
const obj2 = { name: "Igor", gender: true };
const { name, gender } = obj2;
console.log(name);
// Еще одна особенность объектов 
const height = 190;
const building = { height }; // const building = { height: height };
// Дополнительные возможности метода map
const cars = ["BMW", "Porsche", "Opel"]; // "1. Bmw", "2. Porshe"
// порядок важен: элемент первый или второй
const garage = cars.map((element, index) => (index + 1) + ". " + element);
console.log(garage);

// 2. Метод forEach  - не для получения новго массива - не возвращает ничего
// cars.forEach((car)=> console.log(car));
cars.forEach((element) => console.log(element.toUpperCase()));
console.log(cars)
// можно использовать для мутации объектов внутри массива
const products = [{ price: 10, title: "Playstation" }, { price: 5, title: "Ball" }];
products.forEach((product) => product.price = 20);
console.log(products);

// 3. reduce - не мутирующий - у нас был массив - мы хотим получить одно значение 
// - например сумму элементов
const numbers = [1, 5, 6, 7, 9];
const initialValue = 1000;
// 
const result = numbers.reduce(((acc, element) => acc + element), initialValue);
console.log(result);

// 4. filter - возвращает новый массив 
// со всеми элементами для который условие выполняется
const food = ["hamburger", "sandwitch", "cockroach", "steak", "cockroach", "banana"];
const cleanFood = food.filter((element)=> element !== "cockroach" );
console.log(cleanFood);

// 5. some - показывает есть ли элемент удовлетворяющий условию - возвращает boolean
const isBad = food.some((element)=> element === "cockroach");
console.log(isBad);
const isBad2 = cleanFood.some((element)=> element === "cockroach");
console.log(isBad2);

// 6. every - показывет удовлетворяют ли все элементы условию
const isBad3 = food.every((element)=> element === "cockroach");
console.log(isBad3);

// 7. slice - НЕ мутирует - возвращает подмассив - то есть копию части массива 
// если указли один индекс - от этого индекса включительно до конца 
// если указали два - первый включительно, второй нет 
const insects = ["ant", "fly", "bee"];
const insectsSlice = insects.slice(1);
console.log(insects);
console.log(insectsSlice);

// 8. splice - МУТИРУЮЩИЙ - вырезать - заменять куски массива - или удалить элемент 
const birds = ["raven", "owl", "toucan", "sparrow"];
// - аругменты: 1. с какого индекса 2. сколько элементов 3.опциональный - элементы, которыми заменим 
const newBirds = birds.splice(2, 1, "pinguin");
console.log(birds);

// 9. reverse - МУТИРУЮЩИЙ
birds.reverse(); // изменили порядок следования, то есть мутировали массив
console.log(birds);

// 10. indexOf - такой же как в java

// ссылка на документацию:
// https://developer.mozilla.org/ru/docs/Web/JavaScript/Reference/Global_Objects/Array/indexOf
// решайте задачи на codeWars
