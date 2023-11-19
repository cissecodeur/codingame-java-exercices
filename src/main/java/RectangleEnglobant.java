import java.util.ArrayList;
import java.util.List;

public class RectangleEnglobant {

    /*
    Question
Vous devez calculer un rectangle englobant, c'est-à-dire le rectangle contenant un ensemble de points donnés, dans un espace en 2 dimensions.
Vous recevez en paramètre un tableau de nombres entiers, contenant au moins 2 lignes. Chaque ligne contient 2 nombres, représentant les 2 coordonnées (x, y) d'un point.
Vous devez renvoyer un tableau de 4 nombres entiers.
La plus petite valeur parmi toutes les coordonnées x des points données en paramètre. La plus petite valeur parmi toutes les coordonnées y des points données en paramètre. La largeur du rectangle, égale à la plus grande coordonnées x, moins la plus petite des coordonnées x. La hauteur du rectangle : le plus grand y - le plus petit y.
Implémentation
Fonction
Implémenter la méthode boundingRectangle. Paramètres
coordinatesPoints (List<List<Integer>>) : Une liste de coordonnées (x, y), définissant des points dans un espace à 2 dimensions
Valeur de retour
rectangleDefinition (List<Integer>) : Les coordonnées (x, y) du coin supérieur gauche du rectangle, suivi de sa largeur et sa hauteur.
      Contraintes
Mémoire RAM disponible : 512 Mo Durée maximum d'exécution : 1 second
     */

    public static List<Integer> boundingRectangle(List<List<Integer>> coordinatesPoints) {

        List<Integer>  finalList = new ArrayList<>();

        // Je retourne la liste si le tableau est vide
        if (coordinatesPoints.isEmpty()){
            return finalList;
        }

        // J'initialise les valeurs
        int minX = coordinatesPoints.get(0).get(0);
        int minY =  coordinatesPoints.get(0).get(1);

        int maxX = coordinatesPoints.get(0).get(0);
        int maxY = coordinatesPoints.get(0).get(1);


        for(List<Integer> coordinatePoint : coordinatesPoints){
            // je compare les valeurs des abcisses et ordonnées a nos differentes valeurs
            minX = Math.min(minX,coordinatePoint.get(0));
            minY = Math.min(minY,coordinatePoint.get(1));

            maxX = Math.max(maxX,coordinatePoint.get(0));
            maxY = Math.max(maxY,coordinatePoint.get(1));
        }

        // j'ajoute les valeurs au tableau final
        finalList.add(minX);
        finalList.add(minY);
        finalList.add(maxX - minX);
        finalList.add(maxY - minY);


        return  finalList;
    }






}

