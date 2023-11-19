{/*
On vous demande de créer 3 composants React.
Child prend une prop value du type string et l'affiche dans un div ayant id="child" .
Hexed prend deux props :
value de type number component : peut être n'importe quel composant React attendant une prop value de type string
Hexed transforme le nombre value en sa représentation hexadécimale précédée de 0x .
Il affiche ensuite le composant component dans un div ayant id="hexed" auquel il passe la valeur transformée.
Parent prend une prop value de type number.
Parent affiche le composant Hexed en lui passant le prop value et le composant Child .
Au final le code :
 <Parent value={42} />
donne :
    <div id="hexed">
        <div id="child">
    0x2a </div>
    </div>
*/}


import React from "react";
    function Child ({value}){
        return (<div id="child">{value}</div>)
    }


function Hexed({ value, component: Component }) {
    const hexadecimalValue = `0x${value.toString(16)}`;
    return (
        <div id="hexed">
            <Component value={hexadecimalValue} />
        </div>
    );
}

function Parent({value}){
          return( <Hexed value={value} component={Child}/> )
    }


    export {
        Child,
        Hexed,
        Parent
    }

