/*
    Question
Cet exercice consiste à identifier une chaine de caractères composée de parenthèses () et de crochets [].
Une chaine de ce type est considérée comme correcte : si c'est une chaine vide ou null si la chaine A est correcte,
(A) et [A] sont correctes si les chaines A et B sont correctes, la concaténation AB est également correcte Données : La chaine contient au plus 10 000 caractères.
Exemples : [()] est correcte, (()[]) est correcte, ([)] n'est pas correcte, (( n'est pas correcte.
Implémentez la méthode check(String str) qui devra retourner true si la chaine passée en
paramètre est correcte, sinon elle retournera false .

 */

const check = (str) => {
      const stack = [];
      for (let i = 0 ; i < str.length;i++){
          let char = str.charAt(i);
          if( char === '(' ||  char === '[' ){
              stack.push(char);
          }

          else {
              let last = stack.pop();
              if (stack.length === 0){
                  return false;
               }
              if ((char === ')' && last !== '(') || (char === ']' && last !== '[')){
                  return false;
              }

          }
      }
      return stack.length === 0;
}


