public class CalculNombrePairesJoueurs {


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

    public static int nombrePaires(int n){
        int nombrePaire = 0 ;
        if(n < 2){
            return nombrePaire; //Pas assez de joueurs pour former une paire
        }
        nombrePaire = (n*(n-1))/2;
        return  nombrePaire;
    }



}
