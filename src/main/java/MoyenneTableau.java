
public class MoyenneTableau{

     /*  Sujet :Question
Objectif
Inplémentez la fonction average(table) .
La fonction doit renvoyer la valeur moyenne du tableau table donné en paramètre. table est
toujours un tableau défini, et ne contient que des nombres. average doit retourner 0 si table est vide.
   */

   public static  int average(int... array){
         int sum = 0;

         if(array.length == 0){
           return 0;
           }
         for(int num : array){
              sum += num ;
         }

         return sum/array.length;
   }

}
