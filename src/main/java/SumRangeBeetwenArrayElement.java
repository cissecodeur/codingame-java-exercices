public class SumRangeBeetwenArrayElement {


    /*
    Écrivez le corps de la méthode calc(array, n1, n2) . array est un tableau d'entiers.
Les paramètres n1 et n2 sont des entiers définis par la relation 0 <= n1 <= n2 < array.length .
La méthode calc doit retourner la somme des entiers de array dont l'index appartient à l'intervalle
       [n1; n2] .
     */

    public static int calc(int[] array, int n1, int n2) {
        int  sum = 0;

        for(int i = 0 ; i< array.length; i++){
            if(i>=n1 && i<=n2){
                 sum += array[i];
            }
        }
        return sum;
   }
}
