// Деструктуризация как в Redux 
const transport = {
  speed: 30,
  capacity: 4,
};

// как скопировать объект и добавить свойства и добавить новое свойство gas 
// ключ значение

const car = {
  ...transport,
  gas: 98,
};
console.log(car);
// а как в редаксе используется 
// можем ли скопировать объект, но заменить значения в некоторых свойствах

const car2 = {
  ...car,
  gas: 94,
}
console.log(car2)

// как сохранить старое значение и прибавить к нему новое 
const panda = {
  age: 28,
  name: "Po",
}
// как можем скопировать, увеличив возраст на 2 
const panda2 = {
  ...panda,
  age: panda.age + 2
}

console.log(panda2)

const state = {
  students: [
    { name: "Ivan", age: 22 },
    { name: "Igor", age: 23 }
  ]
};
const newStudent = { name: "Katya", age: 21 };

const state2 = { ...state, students: [...state.students, newStudent] };
console.log(state2)
//{
//   students: [
//     { name: 'Ivan', age: 22 },
//     { name: 'Igor', age: 23 },
//     { name: 'Katya', age: 21 }
//   ]
// }
// 
const arr = ["Katya", "Sasha"];
const arr2 = [...arr, "Sveta"];
console.log(arr2); // [ 'Katya', 'Sasha', 'Sveta' ]