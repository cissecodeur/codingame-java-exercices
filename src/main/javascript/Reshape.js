
    /*
    Question
La méthode reshape(n, str) retourne la chaine str sans les espaces et formatée en lignes de n caractères maximum.
Exemples :
Appel Valeur retour
reshape(3, "abc de fghij")
abc
def
ghi
j
reshape(2, "1 23 456")
12
34
 56
Écrivez le corps de la méthode reshape(n, str) . Note : n'ajoutez pas de caractère \n final.
     */

const reshape = (n, str) => {
     var strWithoutSpace = str.replace(/ /g, ""); // Remplacer tous les espaces, pas juste le premier
     var results = [];  // Initialisez le tableau avant de pousser des éléments
     for(let i = 0; i < strWithoutSpace.length; i++){
         results.push(strWithoutSpace.charAt(i));
         // pas d'espace pour le premiser et le dernier caractere

         if((i + 1) % n === 0 && i < strWithoutSpace.length - 1){ // Seulement la première condition est nécessaire
              results.push(" ");
         }
     }
    return results.join(""); // Convertir le tableau en chaîne
}
