/*

Dans cet exercice, on vous demande de créer un composant React nommé WelcomeTitle qui prend deux props, primary et user :
La prop primary est un booléen optionnel : s'il est vrai, le composant affiche un élément h1 , sinon un élément h2 . La prop user est une chaîne de caractères qui peut être null si l'utilisateur n'a pas de nom. Si user n'est pas null, le texte du composant doit être Welcome [USER]! où [USER] désigne la valeur de la prop user. Si user est null, le texte doit être Welcome!.
    Par exemple :
doit être rendu en tant que :
Autre exemple :
doit être rendu en tant que :
 <WelcomeTitle user='Peter' primary />
 <h1>Welcome Peter!</h1>
 <WelcomeTitle />

*/

import React from 'react';

export default function WelcomeTitle({primary = false , user = null}}) {
 const Tag == primary ? 'h1':'h2'
     const message == user ? 'Welcome ${user} !':'Welcome!'    
     return (return <Tag>message</Tag>);
}

