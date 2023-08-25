import java.util.*;
import java.io.*;
import java.math.*;
public class Portails {


    /*
    Question
Objectif
Votre avatar de jeu évolue dans un monde étrange comportant deux portails interspatiaux et bidirectionnels. Écrivez un programme retournant les coordonnées de votre avatar compte tenu d'une série de déplacements et de l'emplacement des portails.
Fonctionnement Le terrain est représenté par une grille de width cases de large et de height cases de haut.
 La case en haut à gauche est située à (0, 0) où le premier entier représente la colonne et le second la ligne. Les positions initiales de votre avatar et des deux portails sont données par des tableaux de deux entiers position , portalA , et portalB . La série de déplacement, moves , est une chaîne composée des caractères U (haut), D (bas), R (droite), L (gauche).
Si votre avatar marche vers une case comportant un portail, il se téléporte au portail associé (et il reste sur cette case cible tant qu'il n'effectue pas d'autre déplacement). S'il bute contre une extrémité du terrain, il n'avance pas et ne se téléporte pas.
Implémentation
Implémentez la méthode computeFinalPosition(width, height, position, portalA, portalB, moves) qui :
prend en entrées les entiers width , height , les tableaux d'entiers position , portalA , portalB , et la chaîne de caractères moves avec : 0 < width < 20 0 < height < 20 0 <= nombre de caractères de
moves <= 255 et retourne la position finale de votre avatar sous la forme d'un tableau de deux entiers.
     */

    public static int[] computeFinalPosition(int width, int height, int[] position, int[]
                portalA, int[] portalB, String moves) {
            // Write your code here
            int avatarX = position[0];
            int avatarY = position[1];
            for (char move : moves.toCharArray()) {
                switch (move) {
                    case 'U':
                        if (avatarY > 0) {
                            avatarY--;
                        }
                        break;
                    case 'D':
                        if (avatarY < height - 1) {
                            avatarY++;
                        }
                        break;
                    case 'L':
                        if (avatarX > 0) {
                            avatarX--;
                        }
                        break;
                    case 'R':
                        if (avatarX < width - 1) {
                            avatarX++;
                        } break;
                }
            }
        if (avatarX == portalA[0] && avatarY == portalA[1]) {
            avatarX = portalB[0];
            avatarY = portalB[1];
        } else if (avatarX == portalB[0] && avatarY == portalB[1]) {
            avatarX = portalA[0];
            avatarY = portalA[1];
        }
        return new int[] { avatarX, avatarY };
  }
}
