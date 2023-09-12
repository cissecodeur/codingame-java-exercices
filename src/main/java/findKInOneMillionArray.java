public class findKInOneMillionArray {
/*
    Le but de cet exercice est de vérifier la présence d’un nombre dans un tableau.

            Spécifications :
    Les éléments sont des nombres entiers classés du plus petit au plus grand
    Le tableau peut contenir jusqu’à 1 million d’éléments
    Le tableau n’est jamais null
    Implémentez la méthode boolean A.exists(int[] ints, int k) afin qu’elle retourne true si k est présent dans ints, sinon la méthode devra retourner false.

    Important : Essayez de privilégier le temps d'exécution.

    Exemple :

    int[] ints = {-9, 14, 37, 102};
A.exists(ints, 102) retourne true
            A.exists(ints, 36) retourne false

 */
    public static boolean exists(int[] ints, int k) {
        int left = 0;
        int right = ints.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (ints[middle] == k) {
                return true; // L'élément k a été trouvé dans le tableau
            } else if (ints[middle] < k) {
                left = middle + 1; // Recherche dans la moitié droite
            } else {
                right = middle - 1; // Recherche dans la moitié gauche
            }
        }

        return false; // L'élément k n'a pas été trouvé dans le tableau
    }

}
