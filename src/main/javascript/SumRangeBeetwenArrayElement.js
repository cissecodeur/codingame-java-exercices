
    /*
    Écrivez le corps de la méthode calc(array, n1, n2) . array est un tableau d'entiers.
Les paramètres n1 et n2 sont des entiers définis par la relation 0 <= n1 <= n2 < array.length .
La méthode calc doit retourner la somme des entiers de array dont l'index appartient à l'intervalle
       [n1; n2] .
     */

    function calc(array,n1,n2){
       var sum = 0;
       for(let i = n1 ;i <= n2 ;i++){
               sum += array[i];
           }
       return sum;
   }

