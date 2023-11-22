/*
Le composant Clock ci-contre est parfaitement fonctionnel :
il se rafrachît chaque seconde affiche l'heure courante dans un div On l'utilise de la manière suivante :
On vous demande de faire un refactor de ce composant pour qu'il ne gére plus l'UI en interne : l'UI sera déléguée à une prop render .
La prop render est une fonction de rendering qui prend un seul argument : le temps courant.
On pourra alors l'appeler de la manière suivante :
pour qu'il affiche :
Après le refactor, le composant ne doit pas ajouter d'éléments graphiques autres que ceux retournés par la fonction render .
   <Clock />

<Clock render={time =>
    <div id='rendered'>
        Rendered time : {new Date(time).toLocaleTimeString()}
    </div>}
/>
<div id='rendered'>
    Rendered time : ...
</div>
 */

import React, { useState, useEffect } from "react";

function Clock({ render }) {
    const [time, setTime] = useState(Date.now());

    useEffect(() => {
        const timer = setInterval(() => setTime(Date.now()), 1000);
        return () => clearInterval(timer);
    }, []);

    // Utiliser la prop render pour afficher l'UI
    return render ? render(time) : null;
}

// Utilisation du composant Clock dans Preview
export function Preview() {
    return (
        <div>
            <Clock render={time =>
                <div id='rendered'>
                    Rendered time : {new Date(time).toLocaleTimeString()}
                </div>
            }/>
        </div>
    );
}

export { Clock };
