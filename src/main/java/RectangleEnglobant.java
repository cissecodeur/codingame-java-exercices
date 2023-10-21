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

    public List<Integer> boundingRectangle(List<List<Integer>> coordinatesPoints) {
        if (coordinatesPoints == null || coordinatesPoints.isEmpty()) {
            throw new IllegalArgumentException("La liste des coordonnées est vide.");
        }

        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;

        for (List<Integer> point : coordinatesPoints) {
            int x = point.get(0);
            int y = point.get(1);

            minX = Math.min(minX, x);
            minY = Math.min(minY, y);
            maxX = Math.max(maxX, x);
            maxY = Math.max(maxY, y);
        }

        int width = maxX - minX;
        int height = maxY - minY;

        return List.of(minX, minY, width, height);
    }


}

