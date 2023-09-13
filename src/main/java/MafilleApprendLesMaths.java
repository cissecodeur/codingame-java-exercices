public class MafilleApprendLesMaths {

    /*
    Ma fille apprend actuellement les additions à l'école. Elle se trompe parfois lorsqu'elle additionne deux
chiffres.
Etant donné les deux nombres initiaux et le résultat qu'elle a calculé, vous devez vérifier s'il est correct.
Si oui, affichez la chaîne de caractères "ok". Si non, renvoyez l'indice du chiffre sur lequel elle s'est
trompée (converti en chaîne de caractères).
Le chiffre des unités a l'indice "0", le chiffre des dizaines a l'indice "1", etc.

Ma fille n'est pas trop mauvaise, elle se trompe sur un seul chiffre au maximum.
Elle vient juste de commencer à apprendre les additions, il n'y a donc pas de retenue dans aucun chiffre
de tous les nombres qu'elle doit additionner.
Les deux nombres initiaux et le résultat peuvent ne pas avoir le même nombre de chiffres.
Exemple
Les deux valeurs initiales sont 123 et 672 . Le résultat calculé est 785 .
Vérification du chiffre des unités : 3 + 2 = 5 . ok Vérification du chiffre des dizaines : 2 + 7 = 9 ,
mais ma fille a écrit 8. C'est faux. Vérification du chiffre des centaines : 1 + 6 = 7 . ok.
Vous devez renvoyer "1" , qui est l'indice du chiffre des dizaines.

Implémentation
Fonction
Implémenter la méthode compute.
Paramètres
valOne (int) : Le premier opérande de l'addition. Positif ou nul.
valTwo (int) : Le second opérande de l'addition. Positif ou nul.
calcResult (int) : Le résultat de l'addition calculée par ma fille (il peut être faux).
Valeur de retour
output (String) : Le texte 'ok' si le calcul est bon. L'index du chiffre où se trouve l'erreur, si le calcul
est faux.
Contraintes
Mémoire RAM disponible : 512 Mo
Durée maximum d'exécution : 1 second
     */
    public static String compute(int valOne, int valTwo, int calcResult) {
        int expectedResult = valOne + valTwo;
        if (expectedResult == calcResult) {
            return "ok";
        } else {
            String calcResultStr = Integer.toString(calcResult);
            String expectedResultStr = Integer.toString(expectedResult);
            int maxLength = Math.max(calcResultStr.length(), expectedResultStr.length());
            for (int i = 0; i < maxLength; i++) {
                if (i >= calcResultStr.length() || i >= expectedResultStr.length() ||
                        calcResultStr.charAt(i) != expectedResultStr.charAt(i)) {
                    return Integer.toString(i);
                }
            }
            return "ok";
        }
    }
}
