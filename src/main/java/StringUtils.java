import java.util.Arrays;
import java.util.stream.Collectors;

public class StringUtils {

    /*
    Question
StringUtils.concat(String[] strings) sert à joindre des chaînes de caractères bout à bout. Par exemple, à partir d'un tableau contenant "f", "o", "o", "bar" , concat devrait retourner
"foobar" .
Données : strings contient toujours au moins un élément. Implémentez StringUtils.concat(String[] strings) .
     */
      public String concat(String[] strings){
            return  String.join("",strings);
      }


}
