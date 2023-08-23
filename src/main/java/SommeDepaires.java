import java.util.HashMap;
import java.util.Map;

public class SommeDepaires {

    /*  Sujet :Question
Objectif
Dans ce problème, on vous donne une liste d'entiers positifs et un entier distinct, k ,
 et on vous demande de trouver s'il existe une paire d'entiers dans la liste dont la somme est exactement k . Implémentation
Implémentez la méthode findSumPair(numbers, k) qui prend comme entrée : un tableau d'entiers positifs ( numbers ).
un nombre entier positif ( k ), représentant la somme cible.
Par exemple :
numbers = [1, 5, 8, 1, 2] k = 13
Votre méthode findSumPair doit retourner un tableau de deux entiers, contenant les indices d'une paire d'entiers dans le tableau dont la somme est k.
Notez que :
Le premier indice dans le tableau est 0. Le premier entier de votre sortie doit représenter l'indice inférieur. [0, 0] doit être retourné si aucune paire n'est trouvée.
Dans le cas où il existe plusieurs paires possibles dont la somme est égale à la cible, retournez la paire dont l'indice de gauche est le plus bas. Dans le cas de deux paires ayant le même indice de gauche, privilégiez la paire dont l'indice de droite est le plus bas.
Pour l'exemple ci-dessus, la sortie correcte serait : [1, 2] .

   */
    public static int[] findSumPair(int[] numbers, int k) {
        Map<Integer, Integer> numToIndex = new HashMap<>();  // HashMap pour stocker les indices des numéros déjà parcourus

        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            int complement = k - num;  // Le complément nécessaire pour obtenir la somme k

            if (numToIndex.containsKey(complement)) {
                return new int[]{numToIndex.get(complement), i};  // On a trouvé une paire dont la somme est k
            } else {
                numToIndex.put(num, i);  // Stocke l'indice du numéro actuel
            }
        }

        return new int[]{0, 0};  // Aucune paire trouvée, on retourne {0, 0}
    }

}
