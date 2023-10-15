{/*
Dans cet exercice on vous demande de créer un composant React simple nommé Blink qui crée un élément <span> affichant le texte passé en tant que contenu du composant.
Le texte doit être visible une seconde, puis caché une seconde, visible à nouveau pendant une seconde et ainsi de suite. Pour cacher le texte, vous devez utiliser la propriété CSS visibility: hidden.
      Par exemple :
          <Blink>Hello World!</Blink>
*/}

import React, { useState, useEffect } from 'react';

const Blink = ({ children }) => {
  const [isVisible, setIsVisible] = useState(true);

  useEffect(() => {
    const interval = setInterval(() => {
      setIsVisible(!isVisible);
    }, 1000);

    // Assurez-vous de nettoyer l'intervalle lorsque le composant est démonté
    return () => clearInterval(interval);
  }, [isVisible]);

  return <span style={{ visibility: isVisible ? 'visible' : 'hidden' }}>{children}</span>;
};

export function Preview() {
  return <Blink>Solution</Blink>;
}

export default Blink;
