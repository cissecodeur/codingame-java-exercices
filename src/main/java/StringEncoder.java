
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
    public String encode(String plainText){
        StringBuilder encodeText = new StringBuilder();
        char prevChar = plainText.charAt(0);
        int counter = 1;
        for (int i = 1 ; i < plainText.length(); i++){
            char nextChar = plainText.charAt(i);
            if (prevChar == nextChar){
                counter ++;
            }
            else {
                encodeText.append(counter).append(prevChar);
                prevChar = nextChar;
                counter = 1;
            }
        }

        encodeText.append(counter).append(prevChar);

        return encodeText.toString();
    }
}
