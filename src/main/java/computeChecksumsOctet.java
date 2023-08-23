import java.util.ArrayList;
import java.util.List;

public class computeChecksumsOctet {

    /*  Sujet :
       Objectif
Certains formats de fichiers (images, vidéos, ...) sont organisés en "chunks" (un morceau du fichier), contenant un en-tête et des données.
Pour s'assurer que les fichiers ne sont pas corrompus, des sommes de contrôle sont parfois calculées.
Vous recevez en entrée un tableau d'entiers compris entre 0 et 255, représentant les octets d'un fichier.
Vous devez renvoyer les sommes de contrôle de tous les chunks.

Le fichier est structuré comme suit :
Le premier octet est l'en-tête du premier chunk, il définit sa taille (l'en-tête n'est pas compté dans la taille).
 Les octets suivants sont les données du chunk. L'octet suivant est l'en-tête du deuxième chunk, et ainsi de suite.
Les données que vous obtenez en entrée seront toujours cohérentes.
Par exemple, si l'en-tête du dernier chunk est 5, vous avez exactement 5 octets juste après, ni plus ni moins.
Vous devez récupérer tous les chunks. Pour chacun d'eux, additionnez leurs octets (en-tête non compris),
et gardez uniquement les 8 bits de poids faible pour avoir sa somme de contrôle. Puis renvoyez un tableau contenant toutes les sommes de contrôle.
Attention: certains chunks peuvent avoir une taille de 0. Dans ce cas, il n'y a pas d'octets de données. L'octet suivant est l'en-tête du chunk suivant.
Un chunk de taille 0 a une somme de contrôle de 0.
La longueur totale de la liste d'entrée ne dépassera pas 1000 octets et contiendra toujours au moins un chunk.
Exemple détaillé
Avec cette liste d'octets :
[3 44 55 66 2 110 220]
Le premier octet vaut 3, donc le premier chunk a une taille de 3. Ses données sont [44, 55, 66 ]. La
somme est 165.
L'octet qui suit vaut 2. Le deuxième bloc a donc une taille de 2. Ses données sont 110 220 .
La somme est 330. Mais il ne faut conserver que les 8 bits de poids faible. 330 modulo 256 vaut 74.
Le résultat à renvoyer est un tableau contenant les octets [165, 74]


Implémentation
Fonction
Implémenter la méthode computeChecksums. Paramètres
fileBytes (List<Integer>) : Une liste d'octets organisée en chunks. Valeur de retour
checksums (List<Integer>) : Les sommes de contrôles de tous les chunks. Contraintes
      Mémoire RAM disponible : 512 Mo Durée maximum d'exécution : 1 second
     */

    public static List<Integer>  computeChecksums(List<Integer> fileBytes) {

        int index = 0;
        List<Integer> checksums = new ArrayList<>();
        while (index < fileBytes.size()) {
            int chunkSize = fileBytes.get(index);
            index++;
            int sum=0;
            for (int i = 0; i < chunkSize; i++) {
                sum += fileBytes.get(index);
                index++;
            }
            int checksum = sum % 256; // Conserver les 8 bits de poids faible
            checksums.add(checksum);
        }
        return checksums;
    }
 }