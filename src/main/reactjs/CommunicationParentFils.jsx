{/*
Un composant Parent et un composant Child sont supposés communiquer de la façon suivante :
Le Parent reçoit la valeur initial depuis ces props et l'affiche dans un div ayant id="value" . Parent passe cette valeur en tant que prop au composant Child. Le composant Child reçoit la valeur de Parent et la met dans un input ayant id="input" . Quand l'input déclenche l'événement onChange , la valeur doit être mise à jour dans les deux composants.
Avec le code actuel, les composants ne suivent pas le comportement attendu. Corriger ce code.
*/}


import React, { useState } from "react";

function Child({ value, setValue }) {

    function handleChange(event) {
        setValue(event.target.value);
    }

    return (
        <div>
            <input id="input" value={value} onChange={handleChange} />
        </div>
    )
}

function Parent({ initial }) {
    const [value, setValue] = useState(initial);

    return (
        <div>
            <div id="value">
                {value}
            </div>
            <Child value={value} setValue={setValue} />
        </div>
    )
}

// Modify this function if you want to change the preview
// It will not be evaluated as part of the assessment
export function Preview() {
    return <Parent initial='test' />;
}

// Do not change
export {
    Parent,
    Child
}
