/*
Question
La fonction factorial suivante, écrite par votre collègue Frédéric est cassée.
Réparez la afin qu'elle renvoie la factorielle du nombre donné en paramètre.
Rappel : factorial(n) = 1 * 2 * 3 * ... * n
*/

const factorial = (n) =>{
    if(n===0){
       return 1; // par convention factoriel 0 = 1
     }
    return n * factorial(n-1);
}