public class Javanais {

    /*
    Objectif
Le javanais, aussi appelé langue de feu, est un procédé de codage argotique qui fut utilisé à la fin du 19ème siècle par certains malfaiteurs pour crypter leurs conversations. Écrivez un programme retournant la traduction en javanais d'une phrase.
Fonctionnement Avant chaque voyelle suivante (a, e, i, o, u), insérez la syllable parasite "av" ; Sauf si la voyelle est précédée d'une autre voyelle.
Implémentation
Implémentez la méthode translate(text) qui :
prend en entrée text , une chaîne de caractères de moins de 255 caractères ; retourne la traduction en javanais, sous la forme d'une chaîne de caractères.
Par simplification, les entrées ne contiennent que des minuscules.

     */

    public static String translate(String text) {
        StringBuilder translated = new StringBuilder();
        boolean previousIsVowel = false;

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            boolean isVowel = isVowel(currentChar);

            if (isVowel && !previousIsVowel) {
                translated.append("av");
            }

            translated.append(currentChar);
            previousIsVowel = isVowel;
        }

        return translated.toString();
    }

    // Méthode pour vérifier si un caractère est une voyelle
    private static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }


}
