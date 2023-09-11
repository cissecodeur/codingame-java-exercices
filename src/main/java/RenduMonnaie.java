public class RenduMonnaie {

/*Les supermarchés s’équipent de plus en plus de caisses automatiques.
 La plupart de ces caisses n’ acceptent que le paiement par carte bancaire bien qu’une part non négligeable de consommateurs paye encore en espèces (avec des billets et des pièces).
Une des problématiques rencontrées avec le paiement en espèces est le rendu de monnaie : comment rendre une somme donnée de façon optimale, c'est-à-dire avec le nombre minimal de pièces et billets ? C'est un problème qui se pose à chacun de nous quotidiennement, à fortiori aux caisses automatiques.
Dans cet exercice, on vous demande d’essayer de trouver une solution optimale pour rendre la monnaie dans un cas précis : quand une caisse automatique ne contient que des pièces de 2€, des billets de 5€ et de 10€.
Pour simplifier le problème, nous considérerons que toutes ces pièces et billets sont disponibles en quantité illimitée.
Voici quelques exemples de rendu de monnaie :
Monnaie à rendre Solutions possibles Solution optimale 1 Impossible Impossible 6 2 + 2 + 2 2 + 2 + 2 10 2 + 2 + 2 + 2 + 2 5 + 5 10 10 9223372036854775807 ... (10 * 922337203685477580) + 5 + 2
Le rendu de monnaie est exprimé par un objet Change . Cet objet a 3 propriétés : coin2 , bill5 et bill10 qui, respectivement, stockent le nombre de pièces de 2€, de billets de 5€ et de billets de 10€.
Par exemple, si on reprend l’exemple n°2 du tableau (6€), on devrait obtenir un objet Change avec : coin2 vaut 3 (3 pièces de 2€) bill5 vaut 0 (pas de billet de 5€) bill10 vaut 0 (pas de billet de 10€)
Implémentez la méthode optimalChange(long s) qui retourne un objet Change contenant les pièces et billets dont la somme vaut s . S’il est impossible de rendre la monnaie (comme dans l’exemple n°1), retournez null .
Pour obtenir un maximum de points votre solution devra toujours rendre la monnaie quand c’est possible et avec le nombre minimal de pièces et billets.
Données : s est toujours un entier ( long ) strictement positif inférieur ou égal à 9223372036854775807*/


    public class Change {
        public long coin2;
        public long bill5;
        public long bill10;

        public Change(long coin2, long bill5, long bill10) {
            this.coin2 = coin2;
            this.bill5 = bill5;
            this.bill10 = bill10;
        }
    }

    public class Cashier {
        public Change optimalChange(long s) {
            if (s < 0) {
                return null; // Impossible de rendre une somme négative
            }

            long bill10Count = s / 10;
            s %= 10;

            long bill5Count = s / 5;
            s %= 5;

            long coin2Count = s / 2;
            s %= 2;

            if (s == 0) {
                return new Change(coin2Count, bill5Count, bill10Count);
            } else {
                return null; // Impossible de rendre la somme avec les pièces et billets disponibles
            }
        }
    }

}
