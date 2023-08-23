import java.util.Arrays;
import java.util.stream.IntStream;

public class FindSmallestInterval {

    /*  Sujet :
    Question
        Implémentez la méthode findSmallestInterval(numbers) qui retourne le plus petit intervalle positif entre deux éléments du tableau numbers .
Par exemple, si on considère le tableau [1 6 4 8 2] , le plus petit intervalle est 1 (différence entre 2 et 1)
Contraintes:
numbers contient au moins deux éléments et au maximum 100 000 éléments. La solution qui privilégie
la vitesse d'exécution pour les tableaux de grande taille obtiendra le plus de points.
La différence entre deux éléments ne dépassera jamais la capacité d'un entier pour votre langage.

     */
    public static int findSmallestInterval(int[] numbers) {
         if (numbers.length < 2 || numbers.length > 100_000){
             throw new ArrayIndexOutOfBoundsException();
         }
        for (int i = 0 ; i<numbers.length;i++){
            int y = numbers[0];
            int z = numbers[numbers.length - 1];
            if(y >= 0  && z >= 0 ){
               return Math.min(y, z);
            }
        }

        return 0;
    }


    public static int findSmallestInterval2(int[] numbers) {
        Arrays.sort(numbers);
        return IntStream.range(0, numbers.length-1)
                .map(e->numbers[e+1]-numbers[e]).min().getAsInt();
    }
 }