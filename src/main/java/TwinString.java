import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwinString {

    /*
      Question
     Le jumeau (twin) d'un mot est un mot écrit avec exactement les mêmes lettres (indépendamment de la casse),
     mais pas nécessairement dans le même ordre.
     Par exemple Marion est le jumeau de Romain .
     La méthode isTwin(a, b) retourne true si b est le jumeau de a ou false si ce n'est pas le cas. a
     et b sont deux chaînes de caractères non null. Écrivez le corps de la méthode isTwin(a, b) .
    */


    public boolean twin(String a , String b){

        if (a.length() != b.length()){
            return false;
        }
        String aToOrder = reversedWord(a.toLowerCase());
        String bToOrder =  reversedWord(b.toLowerCase());
        return aToOrder.equalsIgnoreCase(bToOrder);
    }

    private String reversedWord(String lowerCase) {
        char[] lowerCaseToChars = lowerCase.toCharArray();
        Arrays.sort(lowerCaseToChars);
        return new String(lowerCaseToChars);
    }



}
