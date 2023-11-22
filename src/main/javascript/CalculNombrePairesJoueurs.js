
    /*
    Question
Vous organisez un tournoi d’échecs dans lequel les joueurs s'affronteront en duel.
Pour former les duels on procède ainsi : d'abord on tire au hasard un joueur, ensuite on tire au hasard son opposant parmi les joueurs restants. Cette paire forme un des duels du tournoi. On procède de la même manière pour former toutes les paires.
Dans cet exercice, on souhaiterait connaître le nombre de paires qu'il est possible d'obtenir sachant que l'ordre des opposants dans une paire n'a pas d'importance.
Par exemple, avec 4 joueurs nommés A, B, C et D, il est possible d'obtenir 6 paires différentes : AB, AC, AD, BC, BD, CD.
Implémentez count pour retourner le nombre de paires possibles. Le paramètre n correspond au nombre de joueurs.
Essayez d'optimiser votre solution pour que, dans l'idéal, la durée de traitement soit la même quel que soit n.
  Données : 2 <= n <= 10000

     */

 const nombrePaires = (n) =>{
         var nombrePaire = 0;
         if(n<2){
             return 0;
         }
        nombrePaire = (n*(n-1))/2;
         return nombrePaire;
    }
/*
Question
Implémentez la fonction closestToZero() pour renvoyer l'entier le plus proche de zéro parmi un tableau numbers d'entiers donnés.
S'il y a deux entiers tout aussi proches de zéro, considérez l'entier positif comme étant le plus proche de zéro (par exemple si numbers contient -5 et 5, retournez 5). Si numbers est null ou vide, retournez 0 (zero).
Données : les entiers dans numbers ont des valeurs entières allant de -2147483647 à 2147483647.
 */

const closestToZero = (numbers) => {

    if (numbers.length === 0) return  0
    let closestToZero = numbers[0];
    for (let num of numbers){
       if (Math.abs(num) <=  Math.abs(closestToZero)){
           closestToZero = Math.abs(num)
       }
    }
    return closestToZero;

}



