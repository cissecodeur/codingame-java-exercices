import java.util.Arrays;

public class TwinString {

    public static boolean isTwin(String a, String b) {
        if (a.length() != b.length()) {
            return false;  // Les mots de longueurs différentes ne peuvent pas être jumeaux
        }

        // Convertir les mots en minuscules pour ignorer la casse
        a = a.toLowerCase();
        b = b.toLowerCase();

        // Convertir les mots en tableaux de caractères pour faciliter la comparaison
        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();

        // Trier les tableaux de caractères
        Arrays.sort(aChars);
        Arrays.sort(bChars);

        // Comparer les tableaux triés
        return Arrays.equals(aChars, bChars);
    }

}
