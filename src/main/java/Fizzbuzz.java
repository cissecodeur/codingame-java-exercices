import java.util.Map;
import java.util.stream.IntStream;

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
        // Créer une chaîne vide pour stocker le résultat
        StringBuilder result = new StringBuilder();

        // Parcourir tous les diviseurs de number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // Ajouter la valeur associée à i à la chaîne
                result.append(map.get(i));
            }
        }

        // Retourner la chaîne
        return result.toString();
    }


    public String check(int i) {
        String result = "";
        if(i%3==0)  {
            result = "Fizz";
        }
        if(i%5 ==0 ) {
            result += "Buzz";
        }
        return result.length() > 0 ? result :String.valueOf(i);
    }


    public static void fizBuz(int n){
        IntStream.rangeClosed(0, n).mapToObj(i ->
                        i % 3 == 0 ?
                                (i % 5 == 0 ? "FizzBuzz" : "Fizz") :
                                (i % 5 == 0 ? "Buzz" : i))
                .forEach(System.out::println);


    }

        public static void   main(String args[]){
            fizBuz(100);

        }

}

