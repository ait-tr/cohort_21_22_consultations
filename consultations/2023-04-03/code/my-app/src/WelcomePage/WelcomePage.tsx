import { useState } from "react";
import Child from "../Child/Child";
import React from "react";

function WelcomePage() {
  const normalVariable = 10;
  let [firstName, setFirstName] = useState<string>("Иван");
  let [age, setAge] = useState<number>(0);
  function handleAgeClick(): void {
    setAge(age + 1);
  }

  return (
    <>
      <div>Пример обычной переменной {normalVariable}</div>
      <div>{firstName}</div>
      <div>{age} лет</div>
      <button onClick={handleAgeClick}>Вырасти на 1 год</button>
      <button onClick={() => { setAge(age - 1) }}>Стать младше на 1 год</button>
      <Child props={{age, firstName, setAge}} />

    </>
  );
}

export default WelcomePage;