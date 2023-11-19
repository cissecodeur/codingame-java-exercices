public class BlockInterBloques {

    /*  Sujet :Question
Objectif
Vous fabriquez des jouets en bois dans votre atelier de menuiserie, pour le bonheur de vos petits- enfants. Vous avez prévu toute une série de petits puzzles, et vous souhaiteriez automatiser la rédaction des solutions.
Règles
Chaque puzzle est un quadrillage, sur lequel sont posés des blocs en bois. Ces blocs doivent être sortis du jeu, l'un après l'autre, sans entrer en collision. Vous devez déterminer l'ordre de sortie.
Chaque bloc est numéroté par une valeur entre 0 et 9. Lorsque vous indiquez le numéro d'un bloc, celui- ci sera déplacé vers la droite jusqu'à sortir du jeu.
Tous les blocs ont la forme soit de lignes horizontales, soit de simples carrés de une case par une case. Pour trouver un bloc à sortir, vous pouvez donc sélectionner l'un des numéros situé sur une des cases la plus à droite du quadrillage.
Si plusieurs blocs peuvent être sortis en même temps, vous pouvez commencer par n'importe lequel.
Implémentation
Implémentez la méthode solve(width, height, nbBlocks, grid) . Cette méthode est exécutée à chaque tour de jeu et doit renvoyer le numéro du prochain bloc à déplacer.
Données d'entrée de la méthode
width : largeur du puzzle, en nombre de cases. height : hauteur du puzzle, en nombre de cases. nb_blocks : nombre de blocs initialement présents dans le puzzle. grid : une liste de height éléments, dont chacun est une chaîne de caractère ayant une taille égale à width.
Les paramètres width, height et nb_blocks ne changent pas durant tout le jeu.
Le paramètre grid représente la situation actuelle du puzzle. Chacun de ses caractères peut prendre l'une des valeurs suivantes :
. (un point) : une case vide. X : un mur. Ils sont placés sur la première et la dernière ligne, ainsi qu'au premier caractère de chaque ligne, afin de montrer que la seule sortie possible est par la droite. Vous ne pouvez pas déplacer ces murs. un entier entre 0 et nb_blocks-1 : une case occupée par un bloc. Un même numéro peut être présent plusieurs fois dans la grille, représentant un seul bloc qui s'étend sur plusieurs cases. Toutes les cases ayant un même numéro de bloc sont placées sur une même ligne et sont connexes (elles ne sont jamais séparées en plusieurs groupes isolés).
  Données de sortie de la méthode
 61 / 81
Yacouba (yacouba.cisse@softeam.fr)
Un entier, compris entre 0 et nb_blocks-1, représentant le numéro du bloc que vous souhaitez sortir vers la droite.
Vous ne pouvez déplacer qu'un seul bloc à la fois, toujours vers la droite. Un déplacement est effectué jusqu'au bout : soit jusqu'à ce que le bloc soit entièrement sorti, soit jusqu'à une collision.
Conditions de victoire
Tous les blocs sont sortis du jeu.
(Il y a toujours au moins un ordre possible.)
Conditions de défaite
Une collision a lieu entre le bloc déplacé et un autre bloc.
Contraintes
1 < width < 15
1 < height < 15
1 ≤ nb_blocks < 10
   */
    public static int solve(int width, int height, int nb_blocks, String[] grid) {
        for (int col = width - 1; col >= 0; col--) {
            for (int row = 0; row < height; row++) {
                char current = grid[row].charAt(col);
                if (Character.isDigit(current)) {
                    return current - '0';
                }
            } }
        return -1; // Retourne -1 si aucun bloc ne peut être déplacé
    }



    /*
Écrivez le corps de la méthode calc(array, n1, n2) . array est un tableau d'entiers.
Les paramètres n1 et n2 sont des entiers définis par la relation 0 <= n1 <= n2 < array.length . La méthode calc doit retourner la somme des entiers de array dont l'index appartient à l'intervalle
       [n1; n2] .
     */


    public int calc(int [] array,int  n1, int n2){

            int sum =  0;

            for(int i = n1 ; i <= n2 ; i++){
                 sum += array[i];
            }

        return sum;
    }


}
