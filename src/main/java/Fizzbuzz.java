import java.util.Map;

public class Fizzbuzz {


    /*
        Écrivez le corps de la méthode  fizzBuzz(number, map) .
number  est un entier et  map  est une map non null.
La méthode  fizzBuzz  retourne une chaine de caractères. Cette chaîne est la concaténation des
valeurs de  map  associées aux clés qui sont des diviseurs de l'entier  number  passé en paramètre (par
ordre croissant des diviseurs).
S'il n'y a pas de clés qui peuvent diviser  number , la méthode doit retourner la représentation en chaine
de caractères de  number .
On a  1 <= number <= 100 .
     */

        public static String fizzBuzz(int number, Map<Integer, String> map) {
            StringBuilder result = new StringBuilder();

            for (int i = 1; i <= number; i++) {
                for (Map.Entry<Integer, String> entry : map.entrySet()) {
                    int divisor = entry.getKey();
                    String value = entry.getValue();

                    if (i % divisor == 0) {
                        result.append(value);
                    }
                }
                if (result.length() == 0) {
                    result.append(Integer.toString(i));
                }
                result.append(" ");
            }

            return result.toString().trim();
        }
}
