import java.util.HashSet;
import java.util.Set;

public class TableRotation {


    /*
       Objectif
Certains restaurants sont équipés de tables à plateau tournant qui permettent aux convives de se servir dans plusieurs plats.
Un restaurant souhaite calculer combien de fois un client doit faire tourner le plateau en fonction de sa place et de la disposition des plats.
Fonctionnement On considère une table ronde avec des places numérotées dans le sens des aiguilles d'une montre.
Le nombre de places autour de la table est donnée par l'entier seats .
On considère un client qui est assis à cette table à la place n° customer Devant chaque place peut se trouver : une entrée [E], un plat de résistance [P], un dessert [D], ou rien [N].
Il y a toujours au minimum une entrée, un plat et un dessert sur la table.
Le client peut faire tourner la table vers la gauche ou vers la droite, d'une place à chaque fois.
Le repas se termine lorsque le client a mangé une entrée, un plat et un dessert, dans cet ordre.
Implémentation
Implémentez la méthode calculateTurns(seats, customer, dishes) qui :
prend en entrées les entiers seats et customer et la chaîne dishes , composée des caractères E , P , D , N et représentant l'agencement des plats ;
retourne le nombre minimum de rotations à la fin du
repas, sous forme d'entier. On considère :
0 < seats < 20 0 <= nombre de caractères de dishes < 20

     */
    public static int calculateTurns(int seats, int customer, String dishes) {
        String order = "EPD"; // L'ordre des plats attendus
        int numberRotations = 0; // Le nombre de rotations nécessaires

        for (char dish : dishes.toCharArray()) {
            int clockwise = 0;
            int counterclockwise = 0;

            // Trouver la première occurrence du plat dans le sens des aiguilles d'une montre
            int clockwiseIndex = customer;
            while (dishes.charAt(clockwiseIndex) != dish) {
                clockwiseIndex = (clockwiseIndex + 1) % dishes.length();
                clockwise++;
            }

            // Trouver la première occurrence du plat dans le sens inverse des aiguilles d'une montre
            int counterclockwiseIndex = customer;
            while (dishes.charAt(counterclockwiseIndex) != dish) {
                counterclockwiseIndex = (counterclockwiseIndex - 1 + dishes.length()) % dishes.length();
                counterclockwise++;
            }

            // Sélectionner la direction la plus courte pour atteindre le plat
            int minNumberRotations = Math.min(clockwise, counterclockwise);

            numberRotations += minNumberRotations;
            customer = clockwiseIndex; // Mettre à jour la position du client
            dishes = dishes.substring(0, customer) + dishes.substring(customer + 1); // Retirer le plat mangé
            order = order.replaceFirst(String.valueOf(dish), ""); // Retirer le plat de la liste des plats attendus
        }

        return numberRotations;
    }

    public static void main(String[] args) {
        int seats = 10;
        int customer = 3;
        String dishes = "NPEEPD";

        int result = calculateTurns(seats, customer, dishes);
        System.out.println(result); // Cela devrait afficher 1
    }

}





