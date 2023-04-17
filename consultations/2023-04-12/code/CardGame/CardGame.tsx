import React, { useEffect, useState } from 'react';

function CardGame(): JSX.Element {
  const [cardsArr, setCards] = useState([]);
  const [condition, setCondition] = useState(false);
  useEffect(() => {
    async function loadDeck(): Promise<void> {
      // первый фетч чтобы получить колоду
      const response = await fetch('https://deckofcardsapi.com/api/deck/new/shuffle/?deck_count=1');
      const obj = await response.json();
      // console.log(obj);\
      // eslint-disable-next-line @typescript-eslint/naming-convention
      const { deck_id } = obj;
      // console.log(deck_id);
      // второй фетч, чтобы получить карточку
      const response2 = await fetch(`https://deckofcardsapi.com/api/deck/${deck_id}/draw/?count=4`);
      const cardObj = await response2.json();
      // console.log(cardObj);
      const { cards } = cardObj;
      console.log(cards);
      setCards(cards);
    }
    loadDeck();
  }, []);

  function addCard(): void {
    setCondition(!condition);
  }

  return (
    <div>
      {
        cardsArr.map(
          (card: { image: string }, index) => {
            if (index < 3) {
              return (<img src={card.image} alt="" />);
            }
            return (<> </>);
          }
        )
      }

      <button type="button" onClick={addCard}>Добрать</button>
      {condition ? <img src={cardsArr[3].image} alt="" /> : <> </>}
    </div>
  );
}

export default CardGame;
