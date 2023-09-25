public class ConvertirOctetEnKibioctet {

    /*
    Objectif
Pour éviter la confusion entre les multiples de 1000 octets et les multiples de 1024 octets, les termes
"kibioctet", "mébioctet", etc. ont été inventés.
Un kibioctet (abrégé KiB) correspond à 1024 octets. Un mébioctet (MiB) correspond à (1024*1024 =
1048576) octets
Étant donné une quantité d'octets :
Si elle est inférieure à un KiB, renvoyez-la sous forme d'une chaîne de caractère. Si elle est comprise
entre un KiB (inclus) et un MiB (exclu), convertissez-la en KiB, arrondissez à l'unité inférieure et renvoyezla suivie d'un espace et du texte "KiB".
Si elle est supérieure ou égale à un MiB, convertissez-la en MiB,
arrondissez à l'unité inférieure et renvoyez-la suivie d'un espace et du texte "MiB".
Vous n'aurez jamais de valeurs supérieures à 109 octets, donc vous n'atteindrez jamais le "gibibyte".

Voir l'exemple ci-dessous.
Implémentation
Fonction
Implémenter la méthode compute.
Paramètres
bytesQuantity (int) : une quantité, exprimée en octets.
Valeur de retour
bytesQuantityAdjusted (String) : La même quantité, exprimée en kibioctets (KiB) ou en mébioctets
(MiB), selon son ordre de grandeur.
Contraintes
0 <= bytesQuantity <= 1 000 000 000
Mémoire RAM disponible : 512 Mo
Durée maximum d'exécution : 1 second
     */


    // Constantes pour les seuils de conversion
    private static final int KIBI_BYTE = 1024; // 1 KiB en octets
    private static final int MEBI_BYTE = 1024 * KIBI_BYTE; // 1 MiB en octets

    public static String compute(int bytesQuantity) {
        // Si la quantité est inférieure à 1 KiB
        if (bytesQuantity < KIBI_BYTE) {
            return String.valueOf(bytesQuantity);
        }
        // Si la quantité est inférieure à 1 MiB
        else if (bytesQuantity < MEBI_BYTE) {
            return (bytesQuantity / KIBI_BYTE) + " KiB";
        }
        // Si la quantité est supérieure ou égale à 1 MiB
        else {
            return (bytesQuantity / MEBI_BYTE) + " MiB";
        }
    }


}
