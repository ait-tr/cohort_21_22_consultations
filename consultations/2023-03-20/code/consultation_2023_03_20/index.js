"use strict"
const funBtn = document.getElementById("fun-btn");
console.log(funBtn);
let image = document.createElement("img");
let cleanBtn = document.createElement("button");
cleanBtn.innerText = "Убрать игрушки";

const linkCss = document.createElement("link");


funBtn.addEventListener('click', () => {
  console.log("Волшебство существует");
  image.src = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSZhihBm5eMYQkJDLVN8YyrjF-yjnNhFJNLfw&usqp=CAU";
  image.style.display = "block";
  document.body.appendChild(cleanBtn);
  document.body.appendChild(image);
  funBtn.style.display = "none";
  cleanBtn.style.display = "inline";


  linkCss.rel="stylesheet";
  linkCss.href="index.css";
  document.head.appendChild(linkCss);
});

cleanBtn.addEventListener('click', () => {
    console.log("Начинаем убирать");
    cleanBtn.style.display = "none";
    funBtn.style.display = "inline";
    image.style.display = "none";

});

