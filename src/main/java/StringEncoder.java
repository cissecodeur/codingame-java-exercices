
public class StringEncoder {

    /*

    Question
Implémentez la méthode encode(plainText) qui renvoie un message encodé.
Elle reçoit un paramètre plainText, qui est une chaîne de caractères par exemple aaaabcccaaa.
Vous devez l'encoder en comptant les occurrences consécutives de chaque lettre, par exemple dans aaaabcccaaa, il y a :
4 fois la lettre a puis 1 b puis 3 c puis 3 a
Par conséquent, vous devez retourner la chaîne 4a1b3c3a.
Contraintes :
plainText est une chaîne de caractères en minuscule (entre a et z) plainText n'est jamais null et a une taille maximale de 15000 caractères
 EXEMPLES : PlainText aabaa CypherText 2a1b2a
PlainText aaaabcccaaa CypherText 4a1b3c3a
     */
        public static String encode(String plainText) {
            if (plainText == null || plainText.isEmpty()) {
                return "";
            }

            StringBuilder encoded = new StringBuilder();
            int count = 1;
            char currentChar = plainText.charAt(0);

            for (int i = 1; i < plainText.length(); i++) {
                char charAtIndex = plainText.charAt(i);

                if (charAtIndex == currentChar) {
                    count++;
                } else {
                    encoded.append(count).append(currentChar);
                    currentChar = charAtIndex;
                    count = 1;
                }
            }

            encoded.append(count).append(currentChar);  // Ajoute les dernières occurrences
            return encoded.toString();
        }
}
