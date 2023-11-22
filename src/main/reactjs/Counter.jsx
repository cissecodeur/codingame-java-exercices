import { useState } from 'react'

/*
Counter est un composant simple qui doit afficher :
un entier, qui démarre à zéro, dans un élément ayant l'ID value un bouton ayant l'ID increment qui incrémente value de 1 quand on le clique un bouton ayant l'ID decrement qui décrémente value de 1 quand on le clique
Le composant actuel affiche uniquement 0 et les boutons sont inopérants.
On vous demande de réparer les boutons : chaque clic augmente ou décrémente value de 1.
 */
const Counter = () => {
    const [count, setCount] = useState(0);

    const increment = () => {
        setCount(count + 1);
    };

    const decrement = () => {
        setCount(count - 1);
    };

    const reset = () => {
        setCount(0);
    };

    return (
        <div>
            Total : <span id="value">{count}</span>
            <br />
            <br />
            <button id="reset" onClick={reset}>Réinitialiser</button>
            <button id="decrement" onClick={decrement}>-</button>
            <button id="increment" onClick={increment}>+</button>
        </div>
    );
};

export default Counter;
