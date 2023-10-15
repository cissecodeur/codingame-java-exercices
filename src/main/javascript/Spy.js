
    /*  Sujet :Question
Objectif
Implémentez la fonction spy(fun, callback) , qui renvoie une version surchargée de la fonction fun donnée en paramètre, afin qu'elle appelle la fonction callback donnée en second paramètre chaque
fois qu'elle est appelée.
Attention, la nouvelle fonction doit toujours fonctionner comme l'ancienne, et ce même si la fonction
fun originale accepte de multiples arguments.
callback doit être appellée lors de l'entrée dans la nouvelle fonction. fun et callback ne sont jamais null ou undefined.
             */

// JavaScript code below
// Use printErr(...) to debug your solution.
 function spy(fun, callback) {
    let fun2 = (...args)=>{
    callback();
    return fun(...args);
    }
   return fun2;
 }
