import React from "react";

type Input = {
  props: {
    age: number;
    firstName: string;
    setAge: React.Dispatch<React.SetStateAction<number>>;
  }
}


function Child({ props }: Input): JSX.Element {
  let { age, firstName, setAge } = props;
  return (
    <div>
      Ребенок
      возраст: {age}
      Имя: {firstName}
      <button onClick={() => { setAge(age + 1) }}> Стать старше </button>
    </div>
  );
}

export default Child;