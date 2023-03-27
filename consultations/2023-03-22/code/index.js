const textElement = document.getElementById("text");
const redBox = document.getElementById("red-box");
const playGround = document.getElementById("playground");
const plusBtn = document.getElementById("plus");
const place1 = document.getElementById("place1");
const place2 = document.getElementById("place2");
const place3 = document.getElementById("place3");
const place4 = document.getElementById("place4");
const panda = document.getElementById("panda");
// События: 
// можно прописать функцию отдельно
// - клик левой кнопкой мыши по элементу - 'click'
const myFunction = () => { console.log("Произошел клик левой кнопкой мыши"); }
textElement.addEventListener("click", myFunction);

// слушатель на клик правой кнопкой 'contextmenu'
textElement.addEventListener('contextmenu', () => {
  console.log("Произошел клик правой кнопкой мыши");
})


let toggle = true;
// наведение мыши mouseover
redBox.addEventListener('mouseover', () => {
  console.log("Призошло наведение курсора");
  if (toggle) {
    redBox.style.backgroundColor = "#5cf3a0";
    toggle = !toggle;
  } else {
    redBox.style.backgroundColor = "rgb(237, 200, 100)";
    toggle = !toggle;
  }

})

// когда убираем курсор от элемента mousout
redBox.addEventListener('mouseout', () => {
  console.log("Призошло отведение курсора");
  redBox.style.backgroundColor = "cornflowerblue";
})
const pandaObj = {
  location: 1,
}
// Наша игра 
plusBtn.addEventListener('click', () => {
  console.log("plus");

  pandaObj.location += 1;
  if (pandaObj.location == 5) {
    pandaObj.location = 1;
  }
  
  switch (pandaObj.location) {
    case 1:
      place1.appendChild(panda);
      break;
    case 2:
      place2.appendChild(panda);
      break;
    case 3:
      place3.appendChild(panda);
      break;
    case 4:
      place4.appendChild(panda);
      break;
  }

})
