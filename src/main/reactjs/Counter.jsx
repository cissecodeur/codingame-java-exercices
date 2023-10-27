import { useState } from 'react'

function Counter() {
  const [count, setCount] = useState(0);

  const increment = () => {
    setCount(count+1);
  };

  const decrement = () => {
    setCount(count-1);
  };

  return (
    <div>
      Total : {count}
      <br />
      <br />
      <button onClick={count}>Réinitialiser</button>
      <button onClick={decrement}>-</button>
      <button onClick={increment}>+</button>
    </div>
  );
}

export default App
