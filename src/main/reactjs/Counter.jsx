import { useState } from 'react'

/*
Counter est un composant simple qui doit afficher :
un entier, qui démarre à zéro, dans un élément ayant l'ID value un bouton ayant l'ID increment qui incrémente value de 1 quand on le clique un bouton ayant l'ID decrement qui décrémente value de 1 quand on le clique
Le composant actuel affiche uniquement 0 et les boutons sont inopérants.
On vous demande de réparer les boutons : chaque clic augmente ou décrémente value de 1.
 */

import React from 'react';

class Counter extends React.Component {
    constructor() {
        super();
        this.state = {
            value: 0
        };
    }

    // Méthode pour incrémenter la valeur
    incrementValue = () => {
        this.setState({
            value: this.state.value + 1
        });
    }

    // Méthode pour décrémenter la valeur
    decrementValue = () => {
        this.setState({
            value: this.state.value - 1
        });
    }

    render() {
        return (
            <div>
                <p id="value">{this.state.value}</p>
                <button id="increment" onClick={this.incrementValue}>+</button>
                <button id="decrement" onClick={this.decrementValue}>-</button>
            </div>
        );
    }
}


const CounterFunctionCompent = () => {
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
