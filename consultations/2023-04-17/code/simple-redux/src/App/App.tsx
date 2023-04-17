import React from 'react';
import Counter from '../features/counter/Counter';
import UserPage from '../features/user/UserPage';

function App(): JSX.Element {
  return (
    <div className="App">
      <Counter />
      <UserPage />
    </div>
  );
}

export default App;
