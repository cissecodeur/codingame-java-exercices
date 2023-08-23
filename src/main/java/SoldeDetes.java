import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SoldeDetes {

    /*  Sujet :Question
Objectif
C'est bientôt les soldes d'été !
Vous travaillez pour un magasin qui souhaite offrir une réduction de discount% sur le produit le plus cher acheté par un client donné pendant la période des soldes.
Un seul produit peut bénéficier de la réduction.
Le responsable du magasin vous demande de développer la méthode calculateTotalPrice .
Cette méthode :
prend en paramètres la liste de prix des produits achetés par le client et le pourcentage de réduction
discount . retourne le prix de vente total (arrondi à l'entier inférieur si le total ne tombe pas rond). Contraintes:
0 ≤ discount ≤ 100 0 < prix d'un produit < 100000 0 < nombre de produits < 100 .

   */
    public static int calculateTotalPrice(int[] prices, int discount) {
        if (prices == null || prices.length == 0) {
            return 0; // Retourne 0 si la liste des prix est nulle ou vide
        }
        // Trouve le prix le plus élevé
        int maxPrice = Arrays.stream(prices).max().orElse(0);
        // Calcule le prix total avant réduction
        int totalPrice = Arrays.stream(prices).sum() - maxPrice;
        // Calcule le prix réduit
        int discountedPrice = (int) Math.floor(maxPrice * (1 - (double) discount / 100));
        return totalPrice + discountedPrice;
    }


}
