{/*
Dans cet exercice on vous demande de créer un composant React simple nommé Blink qui crée un élément <span> affichant le texte passé en tant que contenu du composant.
Le texte doit être visible une seconde, puis caché une seconde, visible à nouveau pendant une seconde et ainsi de suite. Pour cacher le texte, vous devez utiliser la propriété CSS visibility: hidden.
      Par exemple :
          <Blink>Hello World!</Blink>
*/}

import React,{useState,useEffect} from 'react';
  // Create the Blink React component here
   const Blink = ({children}) =>{
   const [isVisible,setIsVisible] = useState(true);

    useEffect(() =>{
      const interval = setInterval(() =>{
        setIsVisible((prev) => !prev);
        },1000) ;

       return ()=> clearInterval(interval)
       },[]);

     return <span style={{ visibility: isVisible ? 'visible' : 'hidden'}}>{children}</span>
     }

 // Modify this function if you want to change the preview
 // It will not be evaluated as part of the assessment
export function Preview() {
  return <Blink>Solution</Blink>;
}
// Do not change
export default Blink;
