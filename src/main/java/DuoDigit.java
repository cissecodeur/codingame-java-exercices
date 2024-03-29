import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuoDigit {

    /*  Sujet :
    Question
         On appelle "duodigit" un nombre entier dont la représentation décimale n'utilise pas plus de deux chiffres différents.
       Par exemple 12 , 110 , -33333 sont des duodigits, mais 102 ne l'est pas.
        Implémentez la méthode isDuoDigit(number) qui renvoie un string: y si number est un duodigt n dans le cas contraire
     */


    public static String isDuoDigit(int number) {
        String numberToString = String.valueOf(Math.abs(number));
        Set<Character> setTemp = new HashSet<>();

        for(int i = 0 ; i<numberToString.length();i++){
               Character character = numberToString.charAt(i);
               setTemp.add(character);
        }
        if (setTemp.size() <= 2){
            return "y";
        }

        return "n";
    }

 }