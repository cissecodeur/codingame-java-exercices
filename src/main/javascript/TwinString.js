
    /*
      Question
     Le jumeau (twin) d'un mot est un mot écrit avec exactement les mêmes lettres (indépendamment de la casse),
     mais pas nécessairement dans le même ordre.
     Par exemple Marion est le jumeau de Romain .
     La méthode isTwin(a, b) retourne true si b est le jumeau de a ou false si ce n'est pas le cas. a
     et b sont deux chaînes de caractères non null. Écrivez le corps de la méthode isTwin(a, b) .
    */

    const twin = (a,b) => {
          if(a.length !== b.length){
              return false;
          }
            let aToOrder = Array.from(a.toLowerCase).sort().join('')
            let bToOrder = Array.from(b.toLowerCase).sort().join('')

        return aToOrder === bToOrder;

    }

