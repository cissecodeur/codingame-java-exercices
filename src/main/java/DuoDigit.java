import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class DuoDigit {

    /*  Sujet :
    Question
         On appelle "duodigit" un nombre entier dont la représentation décimale n'utilise pas plus de deux chiffres différents.
       Par exemple 12 , 110 , -33333 sont des duodigits, mais 102 ne l'est pas.
        Implémentez la méthode isDuoDigit(number) qui renvoie un string: y si number est un duodigt n dans le cas contraire
     */
    public static String isDuoDigit(int number) {
        String numberString = Integer.toString(Math.abs(number));
        int count = 0;
        for (int i = 0; i < numberString.length(); i++) {
            char digit = numberString.charAt(i);
            if (numberString.indexOf(digit) == i) {
                count++;
                if (count > 2) {
                    return "n";
                }
            }
        }
        return "y";
    }
 }